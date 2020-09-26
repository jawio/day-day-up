import javax.xml.soap.Node;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm113 {

    /**
     * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
     * <p>
     * 说明: 叶子节点是指没有子节点的节点。
     * <p>
     * 示例:
     * 给定如下二叉树，以及目标和 sum = 22，
     * <p>
     * 5
     * / \
     * 4   8
     * /   / \
     * 11  13  4
     * /  \    / \
     * 7    2  5   1
     * 返回:
     * <p>
     * [
     * [5,4,11,2],
     * [5,8,4,5]
     * ]
     *
     * @param args
     */


    public static void main(String[] args) {

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

    // -------bfs-------

    List<List<Integer>> bfsRes = new ArrayList<>();
    Map<TreeNode, TreeNode> bfsMap = new HashMap<>();

    public List<List<Integer>> bfs(TreeNode treeNode, int sum) {
        if (null == treeNode) {
            return bfsRes;
        }

        // 路径
        Queue<TreeNode> queueNode = new LinkedList<>();
        // 路径值
        Queue<Integer> queueSm = new LinkedList<>();

        queueNode.offer(treeNode);
        queueSm.offer(0);

        while (!queueNode.isEmpty()) {
            TreeNode curNode = queueNode.poll();
            int curSum = queueSm.poll() + curNode.val;

            if (curNode.left == null && curNode.right == null) {
                if (curSum == sum) {
                    getPath(curNode);
                }
            } else {
                if (curNode.left != null) {
                    bfsMap.put(curNode.left, curNode);
                    queueNode.offer(curNode.left);
                    queueSm.offer(curSum);
                }
                if (curNode.right != null) {
                    bfsMap.put(curNode.right, curNode);
                    queueNode.offer(curNode.right);
                    queueSm.offer(curSum);
                }
            }
        }
        return bfsRes;
    }

    public void getPath(TreeNode treeNode) {
        List<Integer> res = new LinkedList<>();
        while (treeNode != null) {
            res.add(treeNode.val);
            treeNode = bfsMap.get(treeNode);
        }
        Collections.reverse(res);
        bfsRes.add(new LinkedList<>(res));
    }


    //----------------------dfs--------------

    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();

    // dfs，计算从根结点到叶子节点的路径值

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, sum);
        return res;
    }

    public void dfs(TreeNode treeNode, int sum) {
        if (treeNode == null) {
            return;
        }
        path.addLast(treeNode.val);
        sum -= treeNode.val;
        if (treeNode.left == null && treeNode.right == null && sum == 0) {
            res.add(new ArrayList<>(path));
        }
        dfs(treeNode.left, sum);
        dfs(treeNode.right, sum);
        path.removeLast();
    }


}
