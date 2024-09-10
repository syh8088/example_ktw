package BASE.section5.part3;

import java.util.*;

public class Main {

    public List<Integer> solution3(int n, int k, int[] arr) {

        List<Integer> answer = new ArrayList<>();



        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//
//        for (int x : T.solution(n, k, arr)) {
//            System.out.print(x + " ");
//        }

        System.out.print(T.solution(7, 4, new int[] {20, 12, 20, 10, 23, 17, 10}));

    }

    /**
     * 내가 풀어본거
     */
    public List<Integer> solution(int n, int k, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            int target = arr[i];
            map.put(target, map.getOrDefault(target, 0) + 1);
        }

        answer.add(map.size());

        for (int i = k; i < n; i++) {
            int target = arr[i];
            map.put(target, map.getOrDefault(target, 0) + 1);

            int i1 = arr[i - k];
            Integer i2 = map.get(i1);
            if (i2 > 1) {
                map.put(i1, i2 - 1);
            }
            else {
                map.remove(i1);
            }

            answer.add(map.size());
        }

        return answer;
    }

    public List<Integer> solution2(int n, int k, int[] arr) {

        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            int target = arr[i];
            map.put(target, map.getOrDefault(target, 0) + 1);
        }

        int lt = 0;
        for (int rt = k + 1; rt < n; rt++) {
            int target = arr[rt];
            map.put(target, map.getOrDefault(target, 0) + 1);
            answer.add(map.size());

            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }

            lt++;
        }

        return answer;
    }

}