package COMPANY_EMULSION.section8.part1;

import java.util.*;

class Solution {


    public int solution2(int[] nums) {







        return -1;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{2, 2, 1, 2, 1, 1}));
        System.out.println(T.solution2(new int[]{1, 0, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution2(new int[]{2, 3, 1, 0, 1, 1, 2, 3, 1, 5, 1, 3, 1}));
        System.out.println(T.solution2(new int[]{1, 2, 1, 2, 1, 2, 1, 1, 3, 1, 2, 1}));
        System.out.println(T.solution2(new int[]{1, 3, 2, 1, 1, 2, 3, 1, 3, 1, 2, 3, 5, 1, 5, 1, 2, 1, 1}));
    }

    /**
     * 내가 풀었던거........ 틀린거?...
     */
    public int solution(int[] nums) {

        int answer = 0;

        answer = this.BFS(nums);


        return answer;
    }

    class Point {
        int index;
        int target;
        int number;

        public Point(int index, int target, int number) {
            this.index = index;
            this.target = target;
            this.number = number;
        }
    }

    public int BFS(int[] nums) {

        int answer = -1;

        int end = nums.length;
        Queue<Point> queue = new LinkedList<>();
        int target = nums[0];
        int[] chack = new int[nums.length];
        queue.offer(new Point(0, target, 0));

        while (!queue.isEmpty()) {

            Point point = queue.poll();
            if (point.index == end - 1) {
//                answer =  Math.min(answer, point.number);
                answer =  point.number;
            }

            for (int i = 1; i <= point.target; i++) {

                int index = point.index + i;
                if (index > nums.length - 1) {
                    continue;
                }
                if (chack[index] == 1) continue;
                chack[index] = 1;

                queue.offer(new Point(index, nums[index], point.number + 1));
            }
        }

        return answer;
    }
}