package 双指针;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 633. Sum of Square Numbers (Easy)
 * https://leetcode.com/problems/sum-of-square-numbers/description/
 */
public class ReverseVowels {
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public static void main(String[] args) {
        String iceCreAm = reverseVowels("IceCreAm");
        System.out.println(iceCreAm);
    }

    private static String reverseVowels(String s){
        if (s==null){
            return null;
        }
        int i=0, j= s.length()-1;
        char[] result = new char[s.length()];
        while (i<=j){
            char f = s.charAt(i);
            char l = s.charAt(j);
            if (!vowels.contains(f)){
                result[i++] = f;
            }else if(!vowels.contains(l)){
                result[j--] = l;
            }else {
                result[i++] = l;
                result[j--] = f;
            }
        }
        return new String(result);
    }
}
