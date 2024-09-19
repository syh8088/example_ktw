package BASE.section8.part8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> queue = new LinkedList<>();

    public int BFS2(int s, int e) {






        return 0;
    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);
//        int s = kb.nextInt();
//        int e = kb.nextInt();
//        System.out.println(T.BFS(s, e));

        System.out.println(T.BFS2(5, 14));
    }


    public int BFS(int s, int e) {

        ch = new int[10001];
        ch[s] = 1;

        queue.offer(s);
        int level = 0;

        while (!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {

                int x = queue.poll();
                if (x == e) {
                    return level;
                }

                for (int j = 0; j < dis.length; j++) {

                    int nx = x + dis[j];
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }

            level++;
        }

       return level;
    }

}