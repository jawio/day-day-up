import java.util.List;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/21 21:35
 * @Descrition
 */


public class LCAlgorithm268 {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 0,1};
        System.out.println(2^3);
        int missingNumber = missingNumber(nums);
        System.out.println(missingNumber);
        int ms = msNumber(nums);
        System.out.println(ms);
    }


    /**
     * 求和相减
     */
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            sum +=  nums[i] - i;
        }
        sum -= i;
        return Math.abs(sum);
    }

    /**
     * 异或运算
     * 0010
     * 0011
     * -----
     * 0001
     */
    public static int msNumber(int[] nums) {
        int num = nums.length;
        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
            num ^= i;
        }
        return num;

    }


}
