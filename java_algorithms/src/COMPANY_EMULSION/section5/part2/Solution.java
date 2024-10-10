package COMPANY_EMULSION.section5.part2;

import java.util.*;

class Solution {

    public int[] solution2(int[] nums) {

        int[] answer = new int[nums.length / 2];

        

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2(new int[]{1, 10, 2, 3, 5, 6})));
        System.out.println(Arrays.toString(T.solution2(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
        System.out.println(Arrays.toString(T.solution2(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
    }

    /**
     * 내가 풀어본거....
     */
    public int[] solution(int[] nums) {

        int[] answer = new int[nums.length / 2];
        HashMap<Integer, Integer> map = new HashMap<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            if (map.containsKey(target)) {
                answer[j] = target;
                j++;

                map.put(target, map.get(target) - 1);
                map.put(target * 2, map.get(target * 2) - 1);
                if (map.get(target) == 0) {
                    map.remove(target);
                }
                if (map.get(target * 2) == 0) {
                    map.remove(target * 2);
                }
            }
        }

        return answer;
    }
}