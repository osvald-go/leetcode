package 双指针;

/**
 * 633. Sum of Square Numbers (Easy)
 * https://leetcode.com/problems/sum-of-square-numbers/description/
 */
public class JudgeSquareSum {
    public static void main(String[] args) {
        boolean b = judgeSquareSum(2147483600);
        System.out.println(b);

    }

    public static boolean judgeSquareSum(int c) {
        int j = (int)Math.sqrt(c);
        int i=0;
        while(i<=j){
            int target = i * i + j * j;
            if (c > target){
                i++;
            }else if(c < target){
                j--;
            }else {
                return true;
            }
        }
        return false;
    }
}
