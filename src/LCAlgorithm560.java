import java.util.Arrays;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm560 {

    /**
     * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
     * <p>
     * <p>
     * 说明 :
     * <p>
     * 数组的长度为 [1, 20,000]。
     * 数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
     * <p>
     * <p>
     * url:https://leetcode-cn.com/problems/subarray-sum-equals-k/
     *
     * @param args
     */

    public static void main(String[] args) {
        int k = 2;
        int[] nums = new int[]{1, 1, 1};
        int subarraySum = subarraySum(nums, k);
        System.out.println(subarraySum);

    }

    public static int subarraySum(int[] nums, int k) {
        int t = 0;
        if (nums.length < 0 || nums.length > 20000) {
            System.out.println("数组长度不合法");
            return 0;
        }
        for (int i = 0; i < nums.length; ++i) {
            // 判断数字大小范围
            int sum = 0;
            for (int j = i; j < nums.length; ++j) {
                sum += nums[j];
                if (sum == k) {
                    t++;
                    System.out.println("i:" + i + "j:" + j);
                }
            }
        }
        return t;
    }


}
