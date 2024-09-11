package COMPANY_EMULSION.section2.part2;

import java.util.*;
class Solution {


    public int[] solution2(int[][] board, int k) {
        int[] answer = new int[2];


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
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 =
                {
                    {0, 0, 0, 1, 0, 1},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 1},
                    {1, 1, 0, 0, 1, 0},
                    {0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0}
                };
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        System.out.println(Arrays.toString(T.solution(arr3, 25)));
    }

    int[][] dis = new int[][] {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
    };

    /**
     * 내가 푼거 틀린거.....
     */
    public int[] solution(int[][] board, int k) {
        int[] answer = new int[2];

        int x = 0;
        int y = 0;

        int pop = 0;
        for (int i = 0; i < k; i++) {
            int[] di;
            if (
                    x + dis[pop][0] >= 0
                            && x + dis[pop][0] < board.length
                            && y + dis[pop][1] >= 0
                            && y + dis[pop][1] < board.length
                            && (board[x + dis[pop][0]][y + dis[pop][1]] == 0)
            ) {

            }
            else {
                i++;
                if (pop == 3) {
                    pop = 0;
                }
                else {
                    pop++;
                }
            }
            di = dis[pop];
            x = x + di[0];
            y = y + di[1];

//            board[x][y] = 1;
        }

        return new int[] {x, y};
    }
}