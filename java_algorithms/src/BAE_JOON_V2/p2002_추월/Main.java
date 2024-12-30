package BAE_JOON_V2.p2002_추월;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2002
 *
 * 💥풀이
 * https://pangseyoung.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%B6%94%EC%9B%94-2002-Java
 */
class Main {

    public static void solution(int N, String[] arr, String[] arr2) {







    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int N = Integer.parseInt(st.nextToken());
//
//        String[] arr = new String[N];
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr[i] = st.nextToken();
//        }
//
//        String[] arr2 = new String[N];
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            arr2[i] = st.nextToken();
//        }

        int N = 5;
        String[] arr = new String[] {
                "ZG508OK",
                "PU305A",
                "RI604B",
                "ZG206A",
                "ZG232ZF"
        };

        String[] arr2 = new String[] {
                "PU305A",
                "ZG232ZF",
                "ZG206A",
                "ZG508OK",
                "RI604B"
        };

        solution2(N, arr, arr2);
    }

    /**
     * 정답
     */
    public static void solution2(int N, String[] arr, String[] arr2) {

        LinkedHashMap <String, Integer> inCar = new LinkedHashMap<>();
        int grate = 1;
        for (int i = 0; i < N; i++) {
            inCar.put(arr[i], grate);
            grate++;
        }

        int pass = 0;
        for (int i = 0; i < N; i++) {
            String outCar = arr2[i];

            Iterator<String> it = inCar.keySet().iterator();
            while (it.hasNext()) {

                int inCarGrate = inCar.get(it.next());
                int outCarGrate = inCar.get(outCar);

                if (inCarGrate < outCarGrate) {
                    pass++;
                    break;
                }
            }

            inCar.remove(outCar);
        }

        System.out.println(pass);
    }

}