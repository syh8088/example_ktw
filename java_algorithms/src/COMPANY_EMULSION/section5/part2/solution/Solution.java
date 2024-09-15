package COMPANY_EMULSION.section5.part2.solution;

import java.util.*;
class Solution {

    public int[] solution(int[] nums) {

        int[] answer = new int[nums.length / 2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        Arrays.sort(nums);

        int idx = 0;
        for (int target : nums) {

            if (map.get(target) == 0) {
                continue;
            }

            answer[idx] = target;

            idx++;
            map.put(target, map.get(target) - 1);
            map.put(target * 2, map.get(target * 2) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
        System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
    }
}