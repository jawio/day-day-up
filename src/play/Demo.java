package play;

import java.util.*;

/**
 * @Author yangjw@tuya.com
 * @Date 2020/9/26 10:46
 * @Descrition
 */


public class Demo {

    public static void main(String[] args) {
        List<String> texts = Arrays.asList("Life is like Machine Learning", "We are Learning from experience");

        Map<String, Integer> res = new HashMap<>();

        for (String text : texts) {
            String[] chars = text.split(" ");
            for (String c : chars) {
                if (res.containsKey(c)) {
                    int val = res.get(c);
                    val++;
                    res.put(c, val);
                } else {
                    res.put(c, 1);
                }
            }
        }

        res.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        });

    }
}
