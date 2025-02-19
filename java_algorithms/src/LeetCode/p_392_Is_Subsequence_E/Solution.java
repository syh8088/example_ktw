package LeetCode.p_392_Is_Subsequence_E;


import java.util.Arrays;

/**
 * https://leetcode.com/problems/is-subsequence/description/
 *
 * 💥풀이
 * https://baehoon.tistory.com/91
 */
public class Solution {


    public boolean isSubsequence2(String s, String t) {

        boolean answer = false;


        return answer;
    }

    public static void main(String[] args) {

        Solution T = new Solution();
        System.out.println(T.isSubsequence("abc", "ahbgdc"));
        System.out.println(T.isSubsequence("axc", "ahbgdc"));
    }


    /**
     * 정답
     */
    public boolean isSubsequence(String s, String t) {

        boolean answer = false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int sIndex = 0;
        int tIndex = 0;
        for (int i = 0; i < tCharArray.length; i++) {

            char sChar = sCharArray[sIndex];
            char tChar = tCharArray[tIndex];

            if (sChar == tChar) {
                sIndex++;
            }

            tIndex++;
        }


        return sCharArray.length == sIndex;
    }


}