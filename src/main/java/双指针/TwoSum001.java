package 双指针;

import java.util.Arrays;

public class TwoSum001 {
    public static void main(String[] args) {
        int[] ints = {2, 7,11,15};
        int target=18;
        int[] res = twoSum(ints, target);
        for (int re : res) {
            System.out.println(re);
        }

    }
    public static int[] twoSum(int[] numbers, int target) {
        int j = numbers.length-1;
        int i=0;
        while (i<j){
            int sum = numbers[i] + numbers[j];
            if (target == sum){
                return new int[]{i,j};
            }else if (target < sum){
                j--;
            }else {
                i++;
            }
        }

        return null;
    }
}
