package COMPANY_EMULSION.section3.part2;

import java.util.*;

class Solution {

    public int[] solution2(String s) {

        int[] answer = new int[5];





        

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2("aaabc")));
        System.out.println(Arrays.toString(T.solution2("aabb")));
        System.out.println(Arrays.toString(T.solution2("abcde")));
        System.out.println(Arrays.toString(T.solution2("abcdeabc")));
        System.out.println(Arrays.toString(T.solution2("abbccddee")));
    }

    /**
     * 내가 풀어보기
     */
    public int[] solution7(String s) {

        int[] answer = new int[5];

        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count > maxCount) {
                maxCount = count;
            }
        }

        char[] array = new char[] {'a', 'b', 'c', 'd', 'e'};
        int i = 0;
        for (char c : array) {
            if (!map.containsKey(c)) {
                answer[i] = maxCount;
            }
            else {
                int count = map.get(c);
                answer[i] = maxCount - count;
            }


            i++;
        }

        return answer;
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
