package 双指针;

/**
 * 680. Valid Palindrome II (Easy)
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(validPalindrome("abca"));
    }

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i<j;i++,j--) {
            if (s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
        }
        return false;
    }

    private static boolean isPalindrome(String s,int i,int j){
        while (i<j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
