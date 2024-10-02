package COMPANY_EMULSION.section3.part4;

import java.util.*;

class Solution {

    public int solution2(int[] nums, int m) {

        int answer = 0;






        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{2, 2, 3, -1, -1, -1, 3, 1, 1}, 5));
        System.out.println(T.solution2(new int[]{1, 2, 3, -3, 1, 2, 2, -3}, 5));
        System.out.println(T.solution2(new int[]{1, 2, 3, -3, 1, 2}, 3));
        System.out.println(T.solution2(new int[]{-1, 0, 1}, 0));
        System.out.println(T.solution2(new int[]{-1, -1, -1, 1}, 0));
    }

    public int solution(int[] nums, int m) {

        int answer = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            sum += num;
            int target = sum - m;

            if (map.containsKey(target)) {
                int i2 = map.get(target);
                answer += i2;
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}