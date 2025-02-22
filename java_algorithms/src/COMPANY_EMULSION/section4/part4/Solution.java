package COMPANY_EMULSION.section4.part4;

import java.util.*;

class Solution {

    public int solution2(int[] laser, String[] enter) {

        int answer = 0;







        return answer;
    }

    class Time2 {
        int enterTime;
        int laserTime;
        int endTime;

        public Time2(int enterTime, int laserTime) {
            this.enterTime = enterTime;
            this.laserTime = laserTime;
            this.endTime = laserTime + enterTime;
        }
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new int[]{30, 20, 25, 15}, new String[] {
                "10:23 0", // 623 -> 653
                "10:40 3", // 640
                "10:42 2", // 642
                "10:52 3", // 652
                "11:10 2"  // 670
        }));
        System.out.println(T.solution2(new int[]{30, 20, 25, 15}, new String[]{
                "10:23 0", // 623
                "10:40 3", // 640
                "10:42 2", // 642
                "10:52 3", // 652
                "15:10 0", // 910
                "15:20 3", // 920
                "15:22 1", // 922
                "15:23 0", // 923
                "15:25 0"  // 925
        }));
        System.out.println(T.solution2(new int[]{30, 20, 25, 15}, new String[]{"10:20 1", "10:40 1", "11:00 1", "11:20 1", "11:40 1"}));
    }

    class Time {
        int startTime;
        int endTime;
        int num;

        public Time(int startTime, int endTime, int num) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.num = num;
        }
    }

    public int solution(int[] laser, String[] enter) {

        int answer = 0;

        List<Time> times = new ArrayList<>();
        for (int i = 0; i < enter.length; i++) {
            String target = enter[i];
            String[] split = target.split(" ");
            String s = split[0];
            int startTime = getTime(s);

//            int i1 = 0;
//            if (i < laser.length) {
//                i1 = laser[i];
//            }

            int num = Integer.parseInt(split[1]);
            int i1 = laser[num];


            Time time = new Time(startTime, startTime + i1, num);
            times.add(time);
        }

        int endTime = 0;
        for (Time time : times) {
            if (endTime > time.startTime) {
                answer++;
            }
            else {
                endTime = time.endTime;
            }
        }



        return answer;
    }

    public int getTime(String target) {
        String[] split = target.split(":");
        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        return h * 60 + m;
    }
}