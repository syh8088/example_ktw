package BASE.section9.part15;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    static int[][] board;

    static int n;
    static int m;
    static int answer = Integer.MAX_VALUE;
    static int pzLen;
    static int[] combi;
    static ArrayList<Point> pz;
    static ArrayList<Point> hs;

    public static void DFS2() {







    }

    public static void main(String[] args) {

        Main T = new Main();

        Scanner kb = new Scanner(System.in);
//        n = kb.nextInt();

        n = 4;
        m = 4;

        pz = new ArrayList<>();
        hs = new ArrayList<>();

//        board = new int[n][m];
        board = new int[][] {
                {0, 1, 2, 0},
                {1, 0, 2, 1},
                {0, 2, 1, 2},
                {2, 0, 1, 2}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int target = board[i][j];
                if (target == 1) {
                    hs.add(new Point(i, j));
                }
                else if (target == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }

        pzLen = pz.size();
        combi = new int[m];

        DFS(0, 0);
        System.out.println(answer);
    }

    /**
     * 0 ~ 5 까지 6가지 숫자 중에 4가지 뽐는 조합의 경우 구하기
     */
    public static void DFS(int L, int s) {

        if (L == m) {

            int sum = 0; // 각 집에 피자집 까지 최소 거리의 모든 도시의 피자 거리
            for (Point hsPoint : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    Point pzPoint = pz.get(i);

                    int calculatedDis = Math.abs(hsPoint.x - pzPoint.x) + Math.abs(hsPoint.y - pzPoint.y);
                    dis = Math.min(dis, calculatedDis);
                }

                sum += dis;
            }

            answer = Math.min(answer, sum);

//            for (int x : combi) {
//                System.out.print(x + " ");
//            }
//
//            System.out.println();
        }
        else {
            for (int i = s; i < pzLen; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    // 연습 해보기.....
    public static void DFS6(int L, int s) {

        if (L == m) {

        }
        else {

            for (int i = s; i < pzLen; i++) {

            }

        }


    }

    static class Point {

        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}