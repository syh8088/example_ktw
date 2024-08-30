package section6.part3;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution2(int[][] board, int[] moves) {

        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[][] board = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = kb.nextInt();
//            }
//        }
//
//        int m = kb.nextInt();
//        int[] moves = new int[m];
//        for (int i = 0; i < m; i++) {
//            moves[i] = kb.nextInt();
//        }
//
//        System.out.println(T.solution(board, moves));

        System.out.println(T.solution(
                new int[][] {
                        { 0, 0, 0, 0, 0 },
                        { 0, 0, 1, 0, 3 },
                        { 0, 2, 5, 0, 1 },
                        { 4, 2, 4, 4, 2 },
                        { 3, 5, 1, 3, 1 }
                },
                new int[] {1, 5, 3, 5, 1, 2, 1, 4}
        ));
    }

    public int solution(int[][] board, int[] moves) {

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < moves.length; i++) {

            int moeve = moves[i];
            int target = extract(moeve - 1, board);
            if (target > 0) {
                if (!stack.empty() && stack.peek().equals(target)) {
                    answer += 2;
                    stack.pop();
                }
                else {
                    stack.push(target);
                }
            }

        }


        return answer;
    }

    public int extract(int col, int[][] board) {
        int length = board.length;
        for (int i = 0; i < length; i++) {
            int i1 = board[i][col];
            if (i1 != 0) {
                board[i][col] = 0;
                return i1;
            }
        }

        return 0;
    }

}