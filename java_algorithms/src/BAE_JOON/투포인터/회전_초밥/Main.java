package BAE_JOON.투포인터.회전_초밥;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2531
 *
 * 💥풀이
 * https://good-or-bad.tistory.com/37
 */
class Main {

    public static int solution(int n, int d, int k, int c, int[] arr) {

        int answer = 0;
        int[] eaten = new int[d + 1];

        for (int i = 0; i < k-1; i++) {
            arr[n++] = arr[i];
        }

        for (int i = 0; i < k; i++) {
            int i1 = arr[i];
            if (eaten[i1] == 0) {
                answer++;
            }
            eaten[i1] += 1;
        }


        int lt = 0;
        int result = 0;
        for (int rt = k; rt < n; rt++) {
            int target = arr[rt];
            int preTarget = arr[lt];

            eaten[preTarget] -= 1;
            if (eaten[preTarget] == 0) {
                answer--;
            }

            if (eaten[target] == 0) {
                answer++;
            }
            eaten[target] += 1;

            if (eaten[c] == 0) {
                answer++;
                result = Math.max(result, answer);
                answer--;
            }
            else {
                result = Math.max(result, answer);
            }


            lt++;
        }

        return result;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 접시의 수
        int d = Integer.parseInt(s[1]); // 초밥의 가짓수
        int k = Integer.parseInt(s[2]); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(s[3]); // 쿠폰 번호

//        int[] list = new int[n];
        int[] list=new int[n + k - 1];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

//        int n = 8; // 접시의 수
//        int d = 30; // 초밥의 가짓수
//        int k = 4; // 연속해서 먹는 접시의 수
//        int c = 30; // 쿠폰 번호
//
//        int[] list = new int[] {7, 9, 7, 30, 2, 7, 9, 25};

        System.out.println(solution(n, d, k, c, list));
    }

}