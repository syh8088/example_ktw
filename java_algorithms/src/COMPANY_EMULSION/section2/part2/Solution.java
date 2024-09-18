package COMPANY_EMULSION.section2.part2;

import java.util.*;

class Solution {

    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int[] solution2(int[][] board, int k) {

        int[] answer = new int[2];
        int pos = 1;
        int x = 0;
        int y = 0;
        for (int i = 0; i < k; i++) {

            int nx = dx[pos];
            int ny = dy[pos];

            int newX = nx + x;
            int newY = ny + y;

            if (newX < 0 || newY < 0 || newX >= board.length || newY >= board[0].length || board[newX][newY] == 1) {
                pos = (pos + 1) % 4;
                continue;
            }

            x = newX;
            y = newY;
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }


    public static void main(String[] args) {
        Solution T = new Solution();
        int[][] arr1 = {
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution2(arr1, 10)));
        int[][] arr2 =
                {
                    {0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1},
                    {1, 1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0}
                };
        System.out.println(Arrays.toString(T.solution2(arr2, 20)));
        int[][] arr3 = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution2(arr3, 25)));
    }


}