package BASE.section8.part12;

import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS2(int v) {



    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        n = kb.nextInt();
//        m = kb.nextInt();
        n = 5;
        m = 9;

//        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];


//        for (int i = 0; i < m; i++) {
//            int a = kb.nextInt();
//            int b = kb.nextInt();
//            graph[a][b] = 1;
//        }


//        {1, 2},
//        {1, 3},
//        {1, 4},
//        {2, 1},
//        {2, 3},
//        {2, 5},
//        {3, 4},
//        {4, 2},
//        {4, 5}

        graph = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0, 1},
        };

        ch[1] = 1;
        T.DFS2(1);
        System.out.println(answer);

    }

    public int DFS(int v) {

        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }

        return answer;
    }
}