package COMPANY_EMULSION.section3.part1;

import java.util.HashMap;

class Solution {

    public int solution2(String s) {

        int answer = 0;




        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }

    /**
     * 내가 풀어본거
     */
    public int solution(String s) {

        int answer = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                return s.indexOf(c) + 1;
            }
        }

        return -1;
    }
}