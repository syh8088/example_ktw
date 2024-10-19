package BAE_JOON.자료구조.최대_힙;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11279
 */
class Main {

    public ArrayList<Integer> solution(int n, int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        


        return list;
    }

    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x);
        }

//        for (int x : T.solution(13, new int[] {0, 1, 2, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0})) {
//            System.out.println(x);
//        }
    }

    /**
     * 내가 풀어보기
     */
    public ArrayList<Integer> solution2(int n, int[] arr) {

        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int target = arr[i];
            queue.offer(target);
            if (target == 0) {
                int poll = queue.poll();
                list.add(poll);
            }
        }

        return list;
    }
}