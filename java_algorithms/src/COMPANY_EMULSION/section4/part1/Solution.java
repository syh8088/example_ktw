package COMPANY_EMULSION.section4.part1;

import java.util.*;

class Solution {

    public int solution2(int[] nums) {

        int answer = 0;









        return answer;
    }

    public static void main(String[] args) {

        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
        System.out.println(T.solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
        System.out.println(T.solution2(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
        System.out.println(T.solution2(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
        System.out.println(T.solution2(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
    }

    public int solution(int[] nums) {

        int answer = 0;
        int cnt = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            if (!hashSet.contains(target - 1)) {
                cnt = 0;

                while (hashSet.contains(target)) {
                    cnt++;
                    target++;
                }

                answer = Math.max(cnt, answer);
            }
        }

        return answer;
    }

    /**
     * 내가 풀어본거... 틀린거...
     */
    public int solution5(int[] nums) {

        int answer = 0;
        int cnt = 1;

        Arrays.sort(nums);
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int target = nums[i];
            if (target == pre + 1) {
                cnt++;
                answer = Math.max(cnt, answer);
                pre = target;
            }
            else if (target == pre) {

            }
            else {
                cnt = 0;
            }
        }

        return answer;
    }
}