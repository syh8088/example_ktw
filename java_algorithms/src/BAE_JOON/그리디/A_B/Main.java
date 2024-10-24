package BAE_JOON.그리디.A_B;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/16953
 *
 * 💥풀이
 * https://waristo.tistory.com/48
 */
class Main {

    public static int solution3(long a, long b) {




        return -1;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        System.out.println(solution3(a, b));
    }

    /**
     * 정답
     */
    public static int solution2(long a, long b) {

        int cnt = 1;
        while (a != b) {

            if (b < a) {
                return -1;
            }

            if (b % 10 == 1) {
                b = b / 10;
            }
            else if (b % 2 == 0) {
                b = b / 2;
            }
            else {
                return -1;
            }

            cnt++;
        }

        return cnt;
    }

    static int answer;

    /**
     * 내가 풀어보기
     */
    public static int solution(long a, long b) {

        answer = -1;
        int L = 1;

        DFS(L, a, b);

        return answer;
    }

    public static void DFS(int L, long a, long b) {

        if (a > b) {
            return;
        }

        if (a == b) {
            answer = L;
        }
        else {
            for (int i = 0; i < 2; i++) {
                DFS(L + 1, a * 2, b);
                DFS(L + 1, a * 10 + 1, b);
            }
        }
    }
}