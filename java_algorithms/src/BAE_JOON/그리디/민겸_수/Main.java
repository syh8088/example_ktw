package BAE_JOON.그리디.민겸_수;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/21314
 *
 * 💥풀이
 * https://record-developer.tistory.com/160
 */
class Main {

    public static void solution(String s) {

        char[] charArray = s.toCharArray();

        StringBuilder maxSb = new StringBuilder();
        int count = 0;
        boolean flag = false;
        for (char c : charArray) {

            if (!flag && c == 'K') {
                maxSb.append(5);
            }
            else if (c == 'M') {
                count++;
                flag = true;
            }
            else if (flag && c == 'K') {
                maxSb.append(5).append("0".repeat(count));
                count = 0;
            }

        }

        if (count != 0) {
            maxSb.append("1".repeat(count));
        }

        StringBuilder minSb = new StringBuilder();
        flag = false;
        count = 0;
        for (char c : charArray) {

            if (!flag && c == 'K') {
                minSb.append(5);
            }
            else if (c == 'M') {
                count++;
                flag = true;
            }
            else if (flag && c == 'K') {
                minSb.append(1);
//                if (count > 1) {
                    minSb.append("0".repeat(count - 1));
//                }

                minSb.append(5);
                count = 0;
                flag = false;
            }

        }

        System.out.println(maxSb.toString());
        System.out.println(minSb.toString());
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
//        String s = "MKKMMK";

        solution(s);
    }

}