package COMPANY_EMULSION.section3.part4.solution;

import java.util.*;

class Solution {

    public int solution(int[] nums, int m) {

        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int x : nums) {
            sum += x;

            int target = sum - m;
            if (map.containsKey(target)) {
                answer += map.get(target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution(new int[]{-1, -1, -1, 1}, 0));
    }
}