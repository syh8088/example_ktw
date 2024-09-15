package COMPANY_EMULSION.section5.part1;

import java.util.*;

class Solution {

    public int[] solution2(int[] nums) {

        int[] answer = new int[nums.length];



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }



    /**
     * 내가 풀어본거...
     */
    public int[] solution(int[] nums) {

        int[] answer = new int[nums.length];

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            String binaryString = Integer.toBinaryString(num);
            char[] charArray = binaryString.toCharArray();

            int count = 0;
            for (char c : charArray) {
                if (c == 49) {
                    count++;
                }
            }
            points.add(new Point(num, count));
        }

        Collections.sort(points);

        int i = 0;
        for (Point point : points) {
            answer[i] = point.num;
            i++;
        }

        return answer;
    }

    class Point implements Comparable<Point> {

        int num;
        int count;

        public Point(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(Point o) {
            if (this.count == o.count) {
                return this.num - o.num;
            }
            return this.count - o.count;
        }
    }
}