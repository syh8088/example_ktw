package BASE.section3.part11;

import java.util.Scanner;

public class Main {

    public int solution5(int n, int[][] arr) {

        int answer = 0;






        

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[][] arr = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        System.out.print(T.solution5(n, arr));

        System.out.print(T.solution5(5, new int[][] {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 2, 3, 1, 7, 3 },
                { 0, 4, 1, 9, 6, 8 },
                { 0, 5, 5, 2, 4, 4 },
                { 0, 6, 5, 2, 6, 7 },
                { 0, 8, 4, 2, 2, 2 }
        }));
    }

    /**
     * 정답
     */
    public int solution2(int n, int[][] arr) {

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {

            int cnt = 0;
            for (int j = 1; j <= n; j++) {

                for (int k = 1; k <= n; k++) {

                    int iTarget = arr[i][k];
                    int jTarget = arr[j][k];

                    System.out.println("iTarget = " + iTarget);
                    System.out.println("jTarget = " + jTarget);
                    if (iTarget == jTarget) {
                        cnt++;
                        break;
                    }
                }

            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public int solution4(int n, int[][] arr) {

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < n; k++) {
                    int target = arr[k][i];
                    int student = arr[j - 1][i];
                    if (j - 1 != k) {
                        if (target == student) {
                            cnt++;
                            break;
                        }
                    }


                    System.out.println("target = " + target);
                    System.out.println("student = " + student);
                }

                System.out.println("j = " + j + " ==================");
            }
        }

        return answer;
    }


    public int solution(int n, int[][] target) {

        int answer = 0;
        int[] result = new int[n];

        int max = 0;
        for (int i = 0; i < n; i++) {
            int cnt=0;
            for (int j = 0; j < n; j++) {
                int i1 = target[j][i];

                for (int k = 0; k < n; k++) {
                    if (j != k) {
                        int k1 = target[k][i];

                        if (i1 == k1) {
                            cnt++;
                        }
                    }
                }

                if (cnt > max) {
                    max = cnt;
                    answer = i;
                }

            }
        }

        return answer;
    }
}