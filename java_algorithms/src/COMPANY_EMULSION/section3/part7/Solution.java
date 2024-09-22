package COMPANY_EMULSION.section3.part7;

import java.util.*;

class Solution {

    public String[] solution2(String[] reports, int time) {

        String[] answer = {};








        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution2(new String[] {
                "john 09:30 in",
                "daniel 10:05 in",
                "john 10:15 out",
                "luis 11:57 in",
                "john 12:03 in",
                "john 12:20 out",
                "luis 12:35 out",
                "daniel 15:05 out"
        }, 60)));
        System.out.println(Arrays.toString(T.solution2(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
        System.out.println(Arrays.toString(T.solution2(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
        System.out.println(Arrays.toString(T.solution2(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
    }

    /**
     * 직접 풀어보기
     */
    public String[] solution(String[] reports, int time) {

//        String[] answer = {};

        HashMap<String, Integer> inT = new HashMap<>();
        HashMap<String, Integer> sumT = new HashMap<>();

        for (String report : reports) {
            String[] split = report.split(" ");
            String name = split[0];
            String timeString = split[1];
            String repo = split[2];

            int timeMM = getTime(timeString);

            if (repo.equals("in")) {
                inT.put(name, timeMM);
            }
            else {
                int inTime = inT.get(name);

                if (sumT.containsKey(name)) {
                    int sum = sumT.get(name);
                    sumT.put(name, timeMM - inTime + sum);
                }
                else {
                    sumT.put(name, timeMM - inTime);
                }
            }
        }

        ArrayList<String> res = new ArrayList<>();
        for (String getName : sumT.keySet()) {
            if (sumT.get(getName) > time) {
                res.add(getName);
            }
        }
        res.sort(String::compareTo);

        String[] answer = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }

    public int getTime(String timeString) {
        String[] split = timeString.split(":");
        int SS = Integer.parseInt(split[0]);
        int MM = Integer.parseInt(split[1]);

        return SS * 60 + MM;
    }
}