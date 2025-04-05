package LeetCode.p_205_Isomorphic_Strings;

import java.util.*;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 *
 * 💥풀이
 * https://baehoon.tistory.com/91
 */
public class Solution {

    public boolean isIsomorphic2(String s, String t) {


        return false;
    }

    public static void main(String[] args) {

        Solution T = new Solution();

        System.out.println(T.isIsomorphic("egg", "add")); // true
        System.out.println(T.isIsomorphic("foo", "bar")); // false
    }


    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            }
            else {
                if (map.containsValue(tChar)) {
                    return false;
                }

                map.put(sChar, tChar);
            }
        }

        return true;
    }

}