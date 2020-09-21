import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/20 21:13
 * @Descrition
 */


public class LCOffer46 {


    /**
     * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
     * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
     * <p>
     * 输入: 12258
     * 输出: 5
     * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
     *
     * @param args
     */


    public static void main(String[] args) {
        int num = 12258;
        int translateNum = translateNum(num);
        System.out.println(translateNum);

    }

    public static int translateNum(int num) {
        if (num < 10) {
            return 1;
        }
        int last = num % 100;
        if (last < 10) {
            return translateNum(num / 10);
        } else if (last < 26) {
            return translateNum(num / 10) + translateNum(num / 100);
        } else {
            return translateNum(num / 10);
        }
    }

//    public static int translateNum(int num) {
//        int res = 0;
//
//        char[] chars = String.valueOf(num).toCharArray();
//        int length = chars.length;
//
//        if (length < 2) {
//            return length;
//        }
//
//        for (int i = 0; i < length; i++) {
//            if (Integer.valueOf(chars[i]) > 2) {
//                continue;
//            }
//            for (int j = i; j < length; ++j) {
//                System.out.println("i:" + i + "-----j:" + j);
//
//            }
//
//        }
//
//
//        return res;
//    }
}
