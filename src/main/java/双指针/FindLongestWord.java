package 双指针;

import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        String s = "abppcplea";
        List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
        String longestWord = findLongestWord(s, d);
        System.out.println(longestWord);

    }
    private static String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String target : d) {
            int l1 = longestWord.length(),l2 = target.length();
            if (l1 > l2 || (l1 == l2 && longestWord.compareTo(target)<0)){
                continue;
            }
            if (isSubstr(s,target)){
                longestWord = target;
            }
        }
        return longestWord;
    }
    private static boolean isSubstr(String s, String target) {
        int i=0,j=0;
        while (i<s.length() && j<target.length()){
            if (s.charAt(i) == target.charAt(j)){
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}
