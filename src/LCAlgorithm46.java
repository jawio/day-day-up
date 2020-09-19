import java.util.*;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm46 {

    /**
     * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
     * <p>
     * 输入: [1,2,3]
     * 输出:
     * [
     * [1,2,3],
     * [1,3,2],
     * [2,1,3],
     * [2,3,1],
     * [3,1,2],
     * [3,2,1]
     * ]
     * <p>
     * https://leetcode-cn.com/problems/permutations/
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 30};
        List<List<Integer>> lists = permute(nums);
        System.out.println(lists);

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int length = nums.length;
        if (length == 0) {
            return res;
        }
        boolean[] used = new boolean[length];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, length, 0, path, used, res);
        return res;

    }

    /**
     * 深度优先遍历
     */
    public static void dfs(int[] nums, int length, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {

        if (depth == length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < length; i++) {
            if (used[i]) {
                continue;
            }
            path.addLast(nums[i]);
            used[i] = true;
            dfs(nums, length, depth + 1, path, used, res);
            path.removeLast();
            used[i] = false;
        }


    }
}
