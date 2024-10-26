package BAE_JOON.구현.크로스_컨트리;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/9017
 *
 * 💥풀이
 * https://velog.io/@nadoran/%EB%B0%B1%EC%A4%80-%ED%81%AC%EB%A1%9C%EC%8A%A4%EC%BB%A8%ED%8A%B8%EB%A6%AC-9017-java
 */
class Main {

    public static void solution2(int n, int[] board) {









    }

    /**
     * 정답
     */
    public static void solution(int n, int[] board) {

        Map<Integer, Team> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int teamNo = board[i];

            // map.computeIfAbsent는 key가 없을 때 새로운 밸류를 입력한 후 밸류를 다시 return함.
            Team team = map.computeIfAbsent(teamNo, v -> new Team(teamNo));
            team.size++; //팀원 카운트
        }

        // 6명 안 되는 team을 제외하고 Team 객체 안의 list에 점수를 입력(4명 점수, 5명 점수 계산위해 list를 사용함)
        int score = 1;
        for (int i = 0; i < board.length; i++) {
            if (map.get(board[i]).size < 6) {
                continue;
            }
            map.get(board[i]).list.add(score++);
        }

        // 정렬을 위한 PriorityQueue를 만듬
        PriorityQueue<Team> priorityQueue = new PriorityQueue<>(new Comparator<Team>() {
            @Override
            public int compare(Team o1, Team o2) {
                if (o1.fourScore == o2.fourScore) {
                    return Integer.compare(o1.fiveScore, o2.fiveScore);
                }
                return Integer.compare(o1.fourScore, o2.fourScore);
            }
        });

        // 6명인 팀의 4명 점수, 5명 점수를 계산하여 입력하고 pq에 넣어서 정렬함
        for (Integer key : map.keySet()) {
            Team team = map.get(key);
            if (team.size == 6) {
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    sum += team.list.get(i);
                    if (i == 3) {
                        team.fourScore = sum;
                    }
                    else if (i == 4) {
                        team.fiveScore = sum;
                    }
                }
                priorityQueue.add(team);
            }
        }

        sb.append(priorityQueue.poll().teamNo).append("\n");
    }

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int T = Integer.parseInt(br.readLine());
//        for (int i = 0; i < T; i++) {
//            int n = Integer.parseInt(br.readLine());
//
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int[] arr = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr[j] = Integer.parseInt(st.nextToken());
//            }
//            solution(n, arr);
//        }

        int T = 2;
        int n1 = 15;
        int[] n1Arr = new int[] {1, 2, 3, 3, 1, 3, 2, 4, 1, 1, 3, 1, 3, 3, 1};
        solution2(n1, n1Arr);

        int n2 = 18;
        int[] n2Arr = new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1};
        solution2(n2, n2Arr);

        System.out.println(sb);
    }

    public static class Team {

        int teamNo;
        int size;
        List<Integer> list = new ArrayList<>();

        int fourScore;
        int fiveScore;

        public Team(int teamNo) {
            this.teamNo = teamNo;
        }
    }
}