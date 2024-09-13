package COMPANY_EMULSION.section3.part2;

import java.util.*;

class Solution {

    public int[] solution2(String s) {

        int[] answer = new int[5];



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution("aaabc")));
        System.out.println(Arrays.toString(T.solution("aabb")));
        System.out.println(Arrays.toString(T.solution("abcde")));
        System.out.println(Arrays.toString(T.solution("abcdeabc")));
        System.out.println(Arrays.toString(T.solution("abbccddee")));
    }

    /**
     * 내가 풀어보기
     */
    public int[] solution(String s) {

        int[] answer = new int[5];

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (char c : map.keySet()) {
            Integer i = map.get(c);
            if (maxCount < i) {
                maxCount = i;
            }
        }

        String str = "abcde";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (map.containsKey(c)) {
                Integer i1 = map.get(c);
                answer[i] = maxCount - i1;
            }
            else {
                answer[i] = maxCount;
            }
        }

        return answer;
    }

}
