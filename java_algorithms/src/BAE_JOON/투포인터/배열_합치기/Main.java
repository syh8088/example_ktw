package BAE_JOON.투포인터.배열_합치기;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11728
 *
 * 💥풀이
 * https://turtle8760.tistory.com/95
 */
class Main {

    public static void solution(int N, int M, int[] Aarr, int[] Barr) {




    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] Aarr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            Aarr[i] = Integer.parseInt(st.nextToken());
        }

        int[] Barr = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            Barr[i] = Integer.parseInt(st.nextToken());
        }

//        int N = 2;
//        int M = 2;
//        int[] Aarr = new int[] {3, 5};
//        int[] Barr = new int[] {2, 9};


        solution2(N, M, Aarr, Barr);
    }

    /**
     * 정답
     */
    public static void solution2(int N, int M, int[] Aarr, int[] Barr) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            arr.add(Aarr[i]);
        }

        for(int i = 0; i < M; i++) {
            arr.add(Barr[i]);
        }

        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int x : arr) {
            sb.append(x).append(" ");
        }

        System.out.println(sb.toString());
    }

}