package BAE_JOON.구현.NBA_농구;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2852
 *
 * 💥풀이
 * https://www.acmicpc.net/problem/2852
 */
class Main {

    public static void solution2(int n, ArrayList<Record> records) {







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

        int n = 5;

        ArrayList<Record> records = new ArrayList<>();
//        records.add(new Record(1, "01:10"));
//        records.add(new Record(2, "21:10"));
//        records.add(new Record(2, "31:30"));

        records.add(new Record(1, "01:10"));
        records.add(new Record(1, "02:20"));
        records.add(new Record(2, "45:30"));
        records.add(new Record(2, "46:40"));
        records.add(new Record(2, "47:50"));
        solution2(n, records);
    }

    /**
     * 정답
     */
    public static void solution(int n, ArrayList<Record> records) {

        ArrayDeque<Integer> dqA = new ArrayDeque<>();
        ArrayDeque<Integer> dqB = new ArrayDeque<>();
        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < n; i++) {
            Record record = records.get(i);
            int team = record.team;
            int second = record.second;

            if (team == 1) {
                dqA.addLast(second);
                if (dqA.size() == dqB.size()) { // 동점 발생
                    totalB += dqA.peekLast() - dqB.peekFirst();
                    dqA.clear();
                    dqB.clear();
                }
            }
            else {
                dqB.addLast(second);
                if (dqA.size() == dqB.size()) { // 동점 발생
                    totalA += dqB.peekLast() - dqA.peekFirst();
                    dqA.clear();
                    dqB.clear();
                }
            }
        }

        if (dqA.size() > dqB.size()) {
            totalA += 48 * 60 - dqA.peekFirst();
        }
        else if (dqA.size() < dqB.size()) {
            totalB += 48 * 60 - dqB.peekFirst();
        }

        StringBuilder sb = new StringBuilder();
        sb.append(convertSecondToString(totalA)).append("\n").append(convertSecondToString(totalB));
        System.out.println(sb);
    }

    private static String convertSecondToString(int totalTime) {

        int min = totalTime / 60;
        int second = totalTime % 60;

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", min)).append(":").append(String.format("%02d", second));
        return sb.toString();
    }

    private static int convertStringToSecond(String timeString) {

        String[] time = timeString.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }

    public static class Record {
        int team;
        int second;

        public Record(int team, int second) {
            this.team = team;
            this.second = second;
        }

        public Record(int team, String second) {
            this.team = team;
            this.second = convertStringToSecond(second);
        }

    }

}