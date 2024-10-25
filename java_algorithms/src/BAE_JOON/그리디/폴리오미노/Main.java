package BAE_JOON.그리디.폴리오미노;

import java.io.*;
import java.util.*;


/**
 * https://www.acmicpc.net/problem/1343
 *
 * 💥풀이
 * https://tang25.tistory.com/entry/%EB%B0%B1%EC%A4%80-1343%EB%B2%88-%ED%8F%B4%EB%A6%AC%EC%98%A4%EB%AF%B8%EB%85%B8-%EC%97%84%ED%83%B1-%EA%B0%9C%EB%B0%9C-%EB%B8%94%EB%A1%9C%EA%B7%B8-%EA%B7%B8%EB%A6%AC%EB%94%94-%EC%9E%90%EB%B0%94
 */
class Main {

    public static void solution(int n, long[] arr) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        solution2(s);
    }




    /**
     * 정답
     */
    public static void solution2(String ss) {

        String[] xs = ss.split("\\.");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < xs.length; i++) {

            String x = xs[i];
            if (x.length() % 2 != 0) {
                sb = new StringBuilder("-1");
                break;
            }
            else if (x.length() % 4 == 0) {
                sb.append("AAAA".repeat(x.length() / 4));
            }
            else {
                sb.append("AAAA".repeat(x.length() / 4));
                sb.append("BB");
            }

            if (i != xs.length - 1) {
                sb.append(".");
            }
        }

        String ans = sb.toString();
        if (!ans.equals("-1")) {
            sb.append(".".repeat(ss.length() - sb.toString().length()));
        }

        System.out.println(sb.toString());
    }

}