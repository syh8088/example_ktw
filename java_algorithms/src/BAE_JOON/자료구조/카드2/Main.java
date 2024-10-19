package BAE_JOON.자료구조.카드2;

import java.util.*;

/**
 * https://www.acmicpc.net/problem/2164
 */
class Main {

    public int solution(int n) {

        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            queue.poll();

            if (queue.size() == 1) {
                return queue.poll();
            }
            int poll = queue.poll();
            queue.offer(poll);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        System.out.println(T.solution(6));
    }
}