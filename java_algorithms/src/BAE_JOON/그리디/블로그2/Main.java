package BAE_JOON.그리디.블로그2;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/20365
 *
 * 💥풀이
 * https://moons-memo.tistory.com/231
 */
class Main {

    public static void solution() throws IOException {

        






    }

    public static void main(String[] args) throws Exception {

        solution2();
    }

    /**
     * 정답
     */
    public static void solution2() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int rcnt = 0;
        int bcnt = 0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {

            char c = arr[i];
            if (i == 0) {
                if (c == 'B') {
                    bcnt++;
                }
                else {
                    rcnt++;
                }
            }
            else {
                if (arr[i - 1] == c) {
                    continue;
                }
                else {
                    if (c=='B') {
                        bcnt++;
                    }
                    else {
                        rcnt++;
                    }
                }
            }

        }

        int ans = 0;
        if (rcnt >= bcnt) {
            ans = bcnt + 1;
        }
        else {
            ans = rcnt + 1;
        }
        System.out.println(ans);

//        int cnt = 1;
//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < n; i++) {
//            char c = charArray[i];
//
//            if (c == 'R') {
//                cnt++;
//                int rt = i + 1;
//                while (rt < n && charArray[rt] == 'R') {
//                    i++;
//                    rt++;
//                }
//
//            }
//        }
//
//
//        System.out.println(cnt);
    }

}