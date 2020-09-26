import java.util.HashMap;
import java.util.Map;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm106 {

    /**
     * 根据一棵树的中序遍历与后序遍历构造二叉树。
     * <p>
     * 注意:
     * 你可以假设树中没有重复的元素。
     * <p>
     * 中序遍历 inorder = [9,3,15,20,7]
     * 后序遍历 postorder = [9,15,7,20,3]
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};

    }

    int last;
    int[] postorder;
    int[] inorder;
    Map<Integer, Integer> idxMap = new HashMap<>();


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        last = postorder.length - 1;

        int idx = 0;
        for (Integer val : inorder) {
            idxMap.put(val, idx++);
        }

        return subTree(0, inorder.length - 1);

    }

    public TreeNode subTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int rootVal = postorder[last];
        TreeNode treeNode = new TreeNode(rootVal);

        Integer idx = idxMap.get(rootVal);
        last--;
        // 右子树
        treeNode.right = subTree(idx + 1, right);
        // 左
        treeNode.left = subTree(left, idx - 1);
        return treeNode;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
