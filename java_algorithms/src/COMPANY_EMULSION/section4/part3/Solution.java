package COMPANY_EMULSION.section4.part3;

import java.util.*;

class Solution {


    public int[] solution(int[] arrival, int[] state) {






        return null;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(
                new int[]{0, 1, 1, 1, 2, 3, 8, 8},
                new int[]{1, 0, 0, 1, 0, 0, 1, 0}
        )));
        System.out.println(Arrays.toString(T.solution(new int[]{3, 3, 4, 5, 5, 5}, new int[]{1, 0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(T.solution(new int[]{2, 2, 2, 3, 4, 8, 8, 9, 10, 10}, new int[]{1, 0, 0, 0, 1, 1, 0, 1, 1, 0})));
    }

    public int[] solution3(int[] arrival, int[] state) {

        int[] answer = new int[arrival.length];
        int length = arrival.length;

        Queue<Integer> enter = new LinkedList<>();
        Queue<Integer> exit = new LinkedList<>();
        int prev = 1;

        int index = 0;
        int t = 0;
        while (index < length) {

            if (enter.isEmpty() && exit.isEmpty()) {
                if (t < arrival[index]) {
                    t = arrival[index];
                    prev = 1;
                }
            }

            while (index < length && arrival[index] <= t) {

                int i1 = state[index];
                if (i1 == 1) {
                    exit.offer(index);
                }
                else {
                    enter.offer(index);
                }

                index++;
            }

            if (prev == 1) {
                if (!exit.isEmpty()) {
                    int poll = exit.poll();
                    answer[poll] = t;
                    prev = 1;
                }
                else {
                    int poll = enter.poll();
                    answer[poll] = t;
                    prev = 0;
                }

            }
            else {
                if (!enter.isEmpty()) {
                    int poll = enter.poll();
                    answer[poll] = t;
                    prev = 0;
                }
                else {
                    int poll = exit.poll();
                    answer[poll] = t;
                    prev = 1;
                }
            }


            if (t  == length) {
                break;
            }

            t++;
            index++;
        }


        return answer;
    }
}