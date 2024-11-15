package BAE_JOON_V2.p1120_문자열;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1120
 *
 * 💥풀이
 *
 */
class Main {

    public static void solution(String A, String B) throws IOException {








    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String A = st.nextToken();
        String B = st.nextToken();

        solution2(A, B);
    }

    /**
     * 정답
     */
    public static void solution2(String A, String B) {

        char[] charArrayA = A.toCharArray();
        int lt = 0;
        int rt = charArrayA.length - 1;

        char[] charArrayB = B.toCharArray();
        int lengthB = charArrayB.length;

        int answer = Integer.MAX_VALUE;
        while (rt < lengthB) {

            int count = 0;
            int aIndex = 0;
            for (int bIndex = lt; bIndex <= rt; bIndex++) {
                char charA = charArrayA[aIndex];
                char charB = charArrayB[bIndex];

                if (charA != charB) {
                    count++;
                }

                aIndex++;
            }

            answer = Math.min(answer, count);

            lt++;
            rt++;
        }
        
        System.out.println(answer);
    }

}