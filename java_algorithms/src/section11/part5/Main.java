package section11.part5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int[] arr, int m) {

        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        int m = kb.nextInt();
//        int dy[] = new int[m + 1];
//        System.out.print(T.solution(n, arr, m, dy));


        System.out.println(T.solution(
                3,
                new int[] {1, 2, 5},
                15,
                new int[15 + 1]
        ));

        /**
         * DFS 로 풀어보기
         */
//        T.DFS(0,3, new int[] {1, 2, 5}, 15, 0);
    }

    public int solution(int n, int[] coinArray, int m, int[] dy) {

        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0] = 0;
        for (int i = 0; i < n; i++) {

            int coin = coinArray[i];
            for (int j = coin; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin] + 1);
            }
        }

        return dy[m];
    }

    /**
     * DFS 로 풀어보기
     */
    static int answer = Integer.MAX_VALUE;
    public void DFS(int L, int n, int[] arr, int m, int sum) {

        if (sum > m) return;

        if (L >= answer) {
            return;
        }

        if (sum == m) {
            answer = Math.min(answer, L);
        }
        else {

            for (int i = 0; i < n; i++) {
                int target = arr[i];
                DFS(L + 1, n, arr, m, sum + target);
            }

        }

    }

}