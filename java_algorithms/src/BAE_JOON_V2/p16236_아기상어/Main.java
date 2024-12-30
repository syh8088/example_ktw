package BAE_JOON_V2.p16236_아기상어;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/16236
 *
 * 💥풀이
 * https://girawhale.tistory.com/39
 */
class Main {

    private static void solution(int n, int[][] arr) {








    }

    private static void bfs2(int N) {













    }

    public static void main(String[] args) throws Exception {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

//        int N = Integer.parseInt(br.readLine());
//        int[][] arr = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            for (int j = 0; j < N; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//        T.solution(N, arr);

        solution(4, new int[][] {
                { 4, 3, 2, 1 },
                { 0, 0, 0, 0 },
                { 0, 0, 9, 0 },
                { 1, 2, 3, 4 }
        });

    }


    // 상하좌우
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int[][] map;
    static int[] cur;

    static int size;
    static int eat; // 먹은 물고기 수
    static int move; // 움직인 총 거리

    private static void solution3(int n, int[][] arr) {

        map = arr;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 9) {
                    cur = new int[]{ i, j };
                    map[i][j] = 0;
                }
            }
        }

        size = 2;
        eat = 0;
        move = 0;
        bfs(n);
    }

    private static void bfs(int N) {

        while (true) {

            /**
             * 우선순위 큐는 생성하며 Comparator를 활용해 우선순위를 설정할 수 있는데
             * int[]배열(순서대로 {y좌표, x좌표, 움직인 거리})을 사용하여 Queue에 넣어주었다.
             *
             * 거리가 다르다면 거리 순으로 오름차순,
             * y축 좌표가 다르다면 y축 좌표로 오름차순
             * 모두 같다면 x축 좌표로 오름차순 정렬을 해주었다.
             */
            PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) ->
                    o1[2] != o2[2] ?
                            Integer.compare(o1[2], o2[2]) :
                            (
                                    o1[0] != o2[0] ?
                                            Integer.compare(o1[0], o2[0]) :
                                            Integer.compare(o1[1], o2[1])
                            )
            );
            
            boolean[][] visit = new boolean[N][N];

            priorityQueue.add(new int[]{cur[0], cur[1], 0}); // y좌표, x좌표, 이동한 거리
            visit[cur[0]][cur[1]] = true;

            boolean ck = false; // 상어가 먹이를 먹었는지 체크할 변수

            while (!priorityQueue.isEmpty()) {
                cur = priorityQueue.poll();

                int x = cur[0];
                int y = cur[1];
                int m = cur[2];

                if (map[x][y] != 0 && map[x][y] < size) { // 먹이가 있으면서 상어의 사이즈보다 작다면?
                    map[x][y] = 0; // 물고기를 제거
                    eat++;
                    move += m; // 움직인 거리를 총 움직인 거리에 추가
                    ck = true; // 먹이 먹었다고 체크
                    break;
                }

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx < 0 || ny < 0 || ny >= N || nx >= N) {
                        continue;
                    }

                    if (visit[nx][ny]) {
                        continue;
                    }

                    // 이동 조건: 아기 상어 보다 작거나 같은 경우에만 이동 할 수 있습니다.
                    if (map[nx][ny] > size) {
                        continue;
                    }

                    priorityQueue.add(new int[]{nx, ny, m + 1});
                    visit[nx][ny] = true;
                }
            }

            // 큐가 비워질 때까지 먹이를 먹은적이 없다면, 더 이상 먹은 물고기가 없으므로 탈출
            if (!ck) {
                break;
            }

            if (size == eat) { // 사이즈와 먹이를 먹은 수가 동일하다면 상어의 크기를 증가
                size++;
                eat = 0;
            }
        }

        System.out.println(move);
    }

//    static int pos = 0;
//
//    static int targetI;
//    static int targetJ;
//
//    static int shark;
//    static int cnt;
//    static int answer; // 이동거리
//
//    public static void solution3(int n, int[][] arr) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (arr[i][j] == 9) {
//                    cur = new int[]{ i, j };
//                    map[i][j] = 0;
//                }
//            }
//        }
//
//        shark = 2;
//        bfs(arr);
//        System.out.println(answer);
//    }
//
//
//    public static void bfs2(int[][] arr) {
//
//    }
//
//
//    public static void bfs(int[][] arr) {
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[]{targetI, targetJ});
//        arr[targetI][targetJ] = 0;
//
//        while (!queue.isEmpty()) {
//
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//
//                int[] poll = queue.peek();
//                int x = poll[0];
//                int y = poll[1];
//
//                int nx = x + dx[pos];
//                int ny = y + dy[pos];
//                if (nx < 0 || ny < 0 || nx >= arr.length || ny >= arr[0].length) {
//                    pos = (pos + 1) % 4;
//                }
//                else if (arr[nx][ny] > shark) {
//                    pos = (pos + 1) % 4;
//                }
//                else {
//                    queue.poll();
//
//                    answer++;
//                    queue.offer(new int[]{nx, ny});
//
//                    if (arr[nx][ny] > 0 && arr[nx][ny] < shark) {
//                        cnt++;
//                        if (shark == cnt) {
//                            cnt = 0;
//                            shark++;
//                        }
//                    }
//
//
//                }
//
//            }
//
//
//        }
//    }

}