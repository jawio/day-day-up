/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm501 {

    /**
     * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
     * <p>
     * 假定 BST 有如下定义：
     * <p>
     * 结点左子树中所含结点的值小于等于当前结点的值
     * 结点右子树中所含结点的值大于等于当前结点的值
     * 左子树和右子树都是二叉搜索树
     * <p>
     * 例如：
     * 给定 BST [1,null,2,2],
     * <p>
     * 1
     * \
     * 2
     * /
     * 2
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] root = new int[]{1, 0, 2, 2};
        int[] mode = findMode(null);
        System.out.println(mode);

    }

    public class ListNode {
        int val;
        ListNode next;

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l1.next);
            return l2;
        }

    }

    public static int[] findMode(TreeNode root) {
        return null;

    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
