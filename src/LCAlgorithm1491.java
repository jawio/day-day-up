/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/17 5:18 PM
 * @Descrition
 */


public class LCAlgorithm1491 {

    /**
     * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
     * <p>
     * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
     * <p>
     * url:https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
     *
     * @param args
     */

    public static void main(String[] args) {
        double[] nums = new double[]{4000, 3000, 1000, 2000};
        double average = average(nums);
        System.out.println(average);

    }

    public static double average(double[] salary) {
        if (salary.length <= 0) {
            return 0;
        }

        double small = salary[0];
        double large = salary[0];
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            large = Math.max(salary[i], large);
            small = Math.min(salary[i], small);
            sum += salary[i];
        }

        sum = sum - small - large;
        int num = salary.length - 2;
        return sum / num;

    }


}
