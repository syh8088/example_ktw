package COMPANY_EMULSION.section5.part7;

import java.util.*;

class Solution {

    public int solution2(int[][] meetings) {

        int answer = 0;





        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new int[][]{{0, 10}, {20, 25}, {5, 15}, {2, 5}}));
        System.out.println(T.solution(new int[][]{{1, 30}, {2, 15}, {3, 10}, {4, 12}, {6, 10}}));
        System.out.println(T.solution(new int[][]{{3, 9}, {1, 10}, {5, 8}, {10, 15}, {9, 14}, {12, 14}, {15, 20}}));
        System.out.println(T.solution(new int[][]{{0, 5}, {2, 7}, {4, 5}, {7, 10}, {9, 12}}));
    }


    class Point implements Comparable<Point> {

        int point;
        char et;

        Point(int point, char et) {
            this.point = point;
            this.et = et;
        }

        @Override
        public int compareTo(Point o) {
            if (this.point == o.point) {
                return this.et - o.et;
            }

            return this.point - o.point;
        }
    }

    public int solution(int[][] meetings) {

        int answer = 0;

        List<Point> points = new ArrayList<>();
        for (int i = 0; i < meetings.length; i++) {
            int[] meeting = meetings[i];
            Point point = new Point(meeting[0], 's');
            points.add(point);

            point = new Point(meeting[1], 'e');
            points.add(point);
        }

        Collections.sort(points);

        int count = 0;
        for (Point point : points) {

            if (point.et == 's') {
                count++;
                answer = Math.max(answer, count);
            }
            else {
                count--;
            }
        }

        return answer;
    }
}