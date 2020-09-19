import java.util.ArrayList;
import java.util.List;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm47 {

    /**
     * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
     * <p>
     * 输入: [1,1,2]
     * 输出:
     * [
     * [1,1,2],
     * [1,2,1],
     * [2,1,1]
     * ]
     * <p>
     * url:https://leetcode-cn.com/problems/permutations-ii/
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1};
        List<List<Integer>> lists = permuteUnique(nums);
        System.out.println(lists);

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

        }
        return null;

    }


}
