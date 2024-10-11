package COMPANY_EMULSION.section5.part1;

import java.util.*;

class Solution {

    public int[] solution2(int[] nums) {

        int[] answer = new int[nums.length];





        
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution2(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution2(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }



    /**
     * 내가 풀어본거...
     */
    public int[] solution(int[] nums) {

        int[] answer = new int[nums.length];

        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = nums[i];
            String binary = Integer.toBinaryString(target);

            int count = 0;
            for (int j = binary.length() - 1; j >= 0; j--) {
                if (binary.charAt(j) == '1') {
                    count++;
                }
            }
            list.add(new int[]{count, target});
        }
        list.sort((a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i)[1];
        }

        return answer;
    }

}