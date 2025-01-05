package Demo0_100;

import utils.LeetCodeUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution001 {


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer num1 = target - nums[i];
            if (map.containsKey(num1)) {
                return new int[]{map.get(num1), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int target = 4;
        int[] ints = twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}
