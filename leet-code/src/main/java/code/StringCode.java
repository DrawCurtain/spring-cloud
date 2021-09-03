package code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/31 9:53
 */

public class StringCode {

    //最长字符串
    public static int maxLengthRepeatString(String s){
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            maxLength = Math. max(maxLength,i-left+1);
        }
        return maxLength;
    }
}
