package BASE.section3.part12;

import java.util.Scanner;

public class Main {

    public int solution3(int col, int row, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                int target = arr[i][j];
                System.out.println("target = " + target);
                for (int k = 0; k < col; k++) {
                    int i1 = arr[j][k];
                    System.out.println("i1 = " + i1);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int m = kb.nextInt();
//        int[][] arr = new int[m][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.print(T.solution(n, m, arr));

        System.out.print(T.solution3(4, 3, new int[][] {
                { 3, 4, 1, 2 },
                { 4, 3, 2, 1 },
                { 3, 1, 4, 2 }
        }));

    }

    public int solution2(int n, int m, int[][] arr) {

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0;
                    int pj = 0;

                    for (int s = 0; s < n; s++) {
                        System.out.println("arr[k][s] = " + arr[k][s]);
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }


        return answer;
    }

}