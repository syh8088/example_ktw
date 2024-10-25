package BAE_JOON.구현.랭킹전_대기열;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/20006
 *
 * 💥풀이
 * https://yeom2yeom2.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%8B%A4%EB%B2%84-2-Java-BJ20006-%EB%9E%AD%ED%82%B9%EC%A0%84-%EB%8C%80%EA%B8%B0%EC%97%B4
 */
class Main {

    /**
     *
     * @param p: 플레이어 수
     * @param m: 방의 정원 수
     * @param lArray: 플레이어 레벨
     * @param nArray: 플레이어 닉네임
     */
    public static void solution(int p, int m, int[] lArray, String[] nArray) {






        
    }




    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        int n = Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }

        int p = 10;
        int m = 5;

        int[] lArray = new int[] {10, 15, 20, 25, 30, 17, 18, 26, 24, 28};
        String[] nArray = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        solution(p, m, lArray, nArray);
    }




    public static class Player implements Comparable<Player> {
        int level;
        String name;

        public Player(int level, String name) {
            this.level = level;
            this.name = name;
        }

        @Override
        public int compareTo(Player o) {
            return this.name.compareTo(o.name); // 문자열 정렬
        }
    }



    /**
     * 정답
     */
    public static void solution2(int p, int m, int[] lArray, String[] nArray) {

        ArrayList<ArrayList<Player>> rooms = new ArrayList<>();
        for (int i = 0; i < p; i++) {

            int level = lArray[i];
            String name = nArray[i];

            if (rooms.size() == 0) {
                rooms.add(new ArrayList<>());
                rooms.get(0).add(new Player(level, name));
                continue;
            }

            boolean flag = false; // 유저가 방을 배정받으면 true
            for (int j = 0; j < rooms.size(); j++) {
                if (rooms.get(j).size() == m) continue;

                int referenceLevel = rooms.get(j).get(0).level;
                if (referenceLevel - 10 <= level && level <= referenceLevel + 10) {
                    flag = true;
                    rooms.get(j).add(new Player(level, name));
                    break;
                }
            }

            if (!flag) {
                rooms.add(new ArrayList<>());
                rooms.get(rooms.size() - 1).add(new Player(level, name));
            }
        }

        for (ArrayList<Player> room : rooms) {
            if (room.size() == m) {
                System.out.println("Started!");
            }
            else {
                System.out.println("Waiting!");
            }

            Collections.sort(room);
            for (Player player : room) {
                System.out.println(player.level + " " + player.name);
            }
        }
    }

}