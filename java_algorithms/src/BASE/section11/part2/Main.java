package BASE.section11.part2;

import java.util.Scanner;

public class Main {

    public int solution2(int n) {



        return 0;
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

    static int[] dy;
    public int solution(int n) {

        dy = new int[n + 2];

        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        return dy[n + 1];
    }

}