package COMPANY_EMULSION.section2.part8;

import java.util.*;

class Solution {

    public int[] solution(int[] enter, int[] exit) {

        int[] answer = {};









        return answer;
    }

    public static void main(String[] args) {

        Solution T = new Solution();

        System.out.println(Arrays.toString(
                T.solution(
                        new int[]{1, 2, 3, 4},
                        new int[]{2, 4, 1, 3}
                )
        ));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 5, 3, 4}, new int[]{2, 3, 1, 4, 5})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 5, 7, 6, 8}, new int[]{2, 3, 5, 6, 1, 4, 8, 7})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 7, 2, 3, 5, 6}, new int[]{5, 2, 6, 1, 7, 3, 4})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3})));
    }

}