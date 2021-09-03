package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/30 14:43
 */

public class ArrayCode {


    public static int[] twoSum(int[] array,int target){
        int[] result;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            int temp = target-array[i];
            if (map.containsKey(array[i])){
                return new int[]{i,map.get(array[i])};
            }else {
                map.put(target-array[i],i);
            }
        }
        return null;
    }

    //盛最多水的容器
    public static int maxArea(int[] nums){
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while (l<r){
            int area = (r-l) * Math.min(nums[l],nums[r]);
            ans = Math.max(ans,area);
            if (nums[l]<nums[r]){
                l++;
            }else {
                r++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
}
