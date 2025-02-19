package LeetCode.p_724_Find_Pivot_Index_E;


import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-pivot-index/description/
 *
 * 💥풀이
 * https://baehoon.tistory.com/91
 */
public class Solution {


    public int pivotIndex2(int[] nums) {

        int answer = -1;



        return answer;
    }

    public static void main(String[] args) {

        Solution T = new Solution();
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(T.pivotIndex2(nums));
    }


    /**
     * 정답
     */
    public int pivotIndex(int[] nums) {

        int answer = -1;


        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int pivotIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            pivotIndex = i;
            totalSum -= nums[i];

            if (totalSum == leftSum) {
                return pivotIndex;
            }

            leftSum += nums[i];
        }

        return answer;
    }


}