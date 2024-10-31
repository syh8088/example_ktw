package BAE_JOON_V2.p2606_바이러스;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2606
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution2() {







    }

    static int answer;
    static int N;
    static int K;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

//        N = 7;
//        K = 6;

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        StringTokenizer st;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

//        graph.get(1).add(2);
//        graph.get(2).add(3);
//        graph.get(1).add(5);
//        graph.get(5).add(2);
//        graph.get(5).add(6);
//        graph.get(4).add(7);

//        graph.get(2).add(1);
//        graph.get(3).add(2);
//        graph.get(5).add(1);
//        graph.get(2).add(5);
//        graph.get(6).add(5);
//        graph.get(7).add(4);

        ch = new int[N + 1];
        answer = 0;
        solution();
        System.out.println(answer);
    }

    /**
     * 정답
     */
    public static void solution() {

        ch[1] = 1;
        DFS(1);
    }

    public static void DFS(int v) {
        
//        if (v == N) {
////            answer++;
//        }
//        else {
            ArrayList<Integer> arrayList = graph.get(v);
            for (int nv : arrayList) {
                int checked = ch[nv];
                if (checked == 0) {
                    ch[nv] = 1;
                    answer++;
                    DFS(nv);
//                    ch[nv] = 0;
                }
            }
//        }
    }


}