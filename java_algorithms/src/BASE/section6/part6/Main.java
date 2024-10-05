package BASE.section6.part6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int k) {

        int answer = 0;





        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int k = kb.nextInt();
//        System.out.print(T.solution2(n, k));

        System.out.print(T.solution2(8, 3));
    }

    public int solution(int n, int k) {

        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {

            if (queue.size() == 1) return queue.poll();

            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    queue.poll();
                } else {
                    queue.offer(queue.poll());
                }
            }
        }

        return answer;
    }

}