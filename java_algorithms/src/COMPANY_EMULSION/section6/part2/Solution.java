package COMPANY_EMULSION.section6.part2;

import java.util.*;
class Solution {

    public int solution2(int[] nums) {

        int answer = 0;






        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{2, 5, 3, 4, 2, 3}));
        System.out.println(T.solution2(new int[]{2, 3, 4, 5}));
        System.out.println(T.solution2(new int[]{3, 3, 3, 3, 3}));
    }


    public int solution(int[] nums) {

        int answer = 0;
        Arrays.sort(nums);

        int lt = 0;
        int rt = nums.length - 1;
        while (lt <= rt) {
            int ltTarget = nums[lt];
            int rtTarget = nums[rt];
            int target = ltTarget + rtTarget;

            if (target <= 5) {
                lt++;
                rt--;
            }
            else {
                rt--;
            }

            answer++;
        }



        return answer;
    }
}