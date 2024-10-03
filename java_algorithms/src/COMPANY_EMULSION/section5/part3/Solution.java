package COMPANY_EMULSION.section5.part3;

import java.util.*;

class Solution {

    public int solution(int[] nums, int k) {

        int answer = 0;



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[]{7, 8, 5, 12, 3, 1, 3, 1, 1, 12}, 2));
        System.out.println(T.solution(new int[]{8, 2, 12, 12, 12, 12, 2, 2}, 2));
        System.out.println(T.solution(new int[]{3, 7, 12, 3, 3, 5, 7, 8, 9, 11, 23, 4, 6, 7}, 3));
        System.out.println(T.solution(new int[]{12, 34, 56, 23, 22, 34, 55, 45, 24, 23, 45, 55, 55, 23, 11, 12, 23, 12}, 3));
        System.out.println(T.solution(new int[]{14, 15, 20, 11, 10, 20, 20, 12, 9, 22, 27, 25, 30, 19}, 3));
    }


    public int solution2(int[] nums, int k) {

        int answer = 0;

        Integer[] tmp = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, (a, b) -> b - a);

        Integer[] diffList = new Integer[nums.length / 2];
        for (int i = 0; i < nums.length / 2; i++) {

            int i1 = tmp[i * 2];
            int i2 = tmp[i * 2 + 1];

            int diff = i1 - i2;
            diffList[i] = diff;
        }
        Arrays.sort(diffList,(a, b) -> b - a);



        return answer;
    }
}