package BASE.section11.part1;

import java.util.Scanner;

public class Main {

    static int answer = Integer.MIN_VALUE;
    static int cnt = 0;

    public int solution2(int n) {

        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        System.out.print(T.solution(n));

//        System.out.print();

//        T.DFS(0, 7, 0);
//        System.out.println(cnt);
        System.out.println(T.solution(7));
    }

    public void DFS(int L, int n, int sum) {

        if (sum > n) {
            cnt++;
            return;
        }

        if (L == n) {
            answer = Math.max(sum, answer);
        }
        else {

            DFS(L + 1, n, sum + 1);
            DFS(L + 1, n, sum + 2);
        }

    }

    static int[] dy;
    public int solution(int n) {

        dy = new int[n + 1];

        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n];
    }

}