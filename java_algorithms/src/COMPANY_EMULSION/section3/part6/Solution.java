package COMPANY_EMULSION.section3.part6;

import java.util.*;

class Solution {

    public String[] solution2(String[] reports, String times) {

        String[] answer = {};








        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2(new String[]{
                "john 15:23",
                "daniel 09:30",
                "tom 07:23",
                "park 09:59",
                "luis 08:57"
        }, "08:33 09:45")));
        System.out.println(Arrays.toString(T.solution2(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
        System.out.println(Arrays.toString(T.solution2(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
    }


    /**
     * 내가 풀어보기
     */
    public String[] solution(String[] reports, String times) {

        String[] timeList = times.split(" ");

        int s = 0;
        int e = 0;
        int i = 0;
        for (String time : timeList) {
            int timeResult = this.calculate(time);

            if (i == 0) {
                s = timeResult;
            }
            else {
                e = timeResult;
            }
            i++;
        }

        List<Report> reportList = new ArrayList<>();
        for (String report : reports) {
            String[] split = report.split(" ");
            String name = split[0];
            int time = calculate(split[1]);

            reportList.add(new Report(name, time));
        }

        Collections.sort(reportList);

        int j = 0;
        ArrayList<String> result = new ArrayList<>();
        for (Report report : reportList) {
            int time = report.time;
            if (s <= time && e >= time) {
                result.add(report.name);
            }
        }

        String[] answer = new String[result.size()];
        for (int v = 0; v < answer.length; v++) {
            answer[v] = result.get(v);
        }

        return answer;
    }

    class Report implements Comparable<Report> {
        String name;
        int time;

        public Report(String name, int time) {
            this.name = name;
            this.time = time;
        }

        @Override
        public int compareTo(Report o) {
            return this.time - o.time;
        }
    }

    public int calculate(String time) {
        String[] split = time.split(":");
        String SS = split[0];
        String MM = split[1];
        int s = Integer.parseInt(SS);
        int m = Integer.parseInt(MM);

        int timeResult = s * 60 + m;
        return timeResult;
    }
}