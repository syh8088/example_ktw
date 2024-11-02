package BAE_JOON_V2.p14891_톱니바퀴;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/14891
 *
 * 💥풀이
 * https://cocoyong.tistory.com/entry/Baekjoon-14891%EB%B2%88-%ED%86%B1%EB%8B%88%EB%B0%94%ED%80%B4-JAVA
 */
class Main {

    private static void bfs2(int N) {






    }

    public static void main(String[] args) throws Exception {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //톱니 4개 입력
//        for (int i = 0; i < 4; i++) {
//            gear[i] = new ArrayList<>();
//            String token[] = br.readLine().split("");
//            for (int j = 0; j < 8; j++) {
//                gear[i].add(Integer.parseInt(token[j]));
//            }
//        }
//
//        int K = Integer.parseInt(br.readLine());              //회전 횟수
//        int[][] input = new int[K][2];
//        for (int i = 0; i < K; i++) {
//
//            String token[] = br.readLine().split(" ");
//
//            int gear_num = Integer.parseInt(token[0]);    //기어 숫자
//            int direction = Integer.parseInt(token[1]);       //회전 방향
//
//            input[i][0] = gear_num;
//            input[i][1] = direction;
//        }

        for (int i = 0; i < 4; i++) {
            gear[i] = new ArrayList<>();
        }
        gear[0].addAll(Arrays.asList(1, 0, 1, 0, 1, 1, 1, 1));
        gear[1].addAll(Arrays.asList(0, 1, 1, 1, 1, 1, 0, 1));
        gear[2].addAll(Arrays.asList(1, 1, 0, 0, 1, 1, 1, 0));
        gear[3].addAll(Arrays.asList(0, 0, 0, 0, 0, 0, 1, 0));

        int K = 2;
        int[][] input = new int[][] {
                {3, -1},
                {1, 1}
        };

        solution3(K, input);
    }

    public static ArrayList<Integer>[] gear = new ArrayList[4];
    public static int gear_direction[] = new int[4];     // 1 : 오른쪽 회전, -1 : 왼쪽 회전, 0 : 회전x
    public static int score = 0;

    private static void solution3(int K, int[][] input) {

        for (int i = 0; i < K; i++) {
            int[] ints = input[i];
            int gear_num = ints[0] - 1; // 기어 숫자
            int direction = ints[1]; // 회전 방향

            Arrays.fill(gear_direction, 0);               //회전 방향 초기화
            gear_direction[gear_num] = direction;
            right(gear_num);
            left(gear_num);

            //회전시작!
            for (int j = 0; j < 4; j++) {
                if (gear_direction[j] == 1) {
                    rightTurn(j);
                } else if (gear_direction[j] == -1) {
                    leftTurn(j);
                } else {
                    continue;
                }
            }
        }

        sumScore();
        System.out.print(score);
    }

    //왼쪽 기어랑 비교
    static void left(int gear_num) {
        if (gear_num == 0) return;

        if (gear[gear_num - 1].get(2) != gear[gear_num].get(6)) {
            if (gear_direction[gear_num] == 1) {
                gear_direction[gear_num - 1] = -1;
            } else if(gear_direction[gear_num] == -1) {
                gear_direction[gear_num - 1] = 1;
            }
            left(gear_num - 1);
        }
    }

    //오른쪽 기어랑 비교
    static void right(int gear_num) {
        if (gear_num == 3) {
            return;  //기어가 3이 마지막이므로 종료
        }

        if (gear[gear_num].get(2) != gear[gear_num + 1].get(6)) {   //gear0[2], gear1[6]비교
            if (gear_direction[gear_num] == 1) {
                gear_direction[gear_num + 1] = -1;
            }
            else if (gear_direction[gear_num] == -1) {
                gear_direction[gear_num + 1] = 1;
            }
            right(gear_num + 1);
        }
    }

    //반시계 방향 회전 (-1)
    static void leftTurn(int i) {
        gear[i].add(gear[i].get(0));
        gear[i].remove(0);
    }

    //시계 방향 회전 (1)
    static void rightTurn(int i) {
        gear[i].add(0, gear[i].get(7));
        gear[i].remove(8);
    }

    //최종 점수 계산
    static void sumScore() {
        for (int i = 0; i < 4; i++) {
            score += gear[i].get(0) * (1 << i);
        }
    }
}