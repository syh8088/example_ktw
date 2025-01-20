package PROGRAMMERS.p_신고_결과_받기;

import java.util.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/92334
 *
 * 💥풀이
 * https://www.youtube.com/watch?v=ncCUNOJUn9Q&list=PLlV7zJmoG4XIPxX-OSTAtTArU54kPDnui&index=2
 */
public class Solution {

    public int[] solution2(String[] id_list, String[] report, int k) {

        int[] answer = {};






        return answer;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] id_list = new String[] {"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

        System.out.println(Arrays.toString(solution.solution(id_list, report, 2)));


        id_list = new String[] {"con", "ryan"};
        report = new String[] {"ryan con", "ryan con", "ryan con", "ryan con"};
        System.out.println(Arrays.toString(solution.solution(id_list, report, 3)));
    }

    public int[] solution(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report) {
            reportSet.add(rep);
        }


        Map<String, List<String>> map = new LinkedHashMap<>();
        Map<String, Integer> mapReport = new LinkedHashMap<>();
        int length = report.length;

        for (String s : reportSet) {
            String[] split = s.split(" ");
            String s1 = split[0];
            String s2 = split[1];

            List<String> orDefault = map.getOrDefault(s1, new ArrayList<>());
            orDefault.add(s2);
            map.put(s1, orDefault);

            mapReport.put(s2, mapReport.getOrDefault(s2, 0) + 1);
        }

        int i = 0;
        for (String id : id_list) {

            if (map.containsKey(id)) {
                int cnt = 0;
                List<String> reportList = map.get(id);
                for (String targetReport : reportList) {
                    if (mapReport.containsKey(targetReport) && mapReport.get(targetReport) >= k) {
                        cnt++;
                    }
                }

                answer[i] = cnt;
            }
            else {
                answer[i] = 0;
            }

            i++;
        }

        return answer;
    }

    /**
     * 정답
     */
    public int[] solution3(String[] id_list, String[] report, int k) {

        int[] answer = new int[id_list.length];

        // 1. 중복 제거
        HashSet<String> reportSet = new HashSet<>();
        for (String rep : report) {
            reportSet.add(rep);
        }

        // 2. report에서 각 사람이 신고당한 횟수를 countHash으로 정의하기
        HashMap<String, ArrayList<String>> notifyListHash = new HashMap<>();
        for (String rep : reportSet) {
            int blankIdx = rep.indexOf(" ");
            String reporter = rep.substring(0, blankIdx);
            String reportee = rep.substring(blankIdx + 1);

            ArrayList<String> reporterList = notifyListHash.getOrDefault(reportee, null);
            if (reporterList == null) {
                reporterList = new ArrayList<>();
            }

            reporterList.add(reporter);
            notifyListHash.put(reportee, reporterList);
        }

        // 3. notifyListHash를 기반으로 reportHash만들기
        HashMap<String, Integer> reporterHash = new HashMap<>();
        for (ArrayList<String> notifyList : notifyListHash.values()) {
            if (notifyList.size() >= k) {
                for (String reporter : notifyList) {
                    reporterHash.put(
                            reporter,
                            reporterHash.getOrDefault(reporter, 0) + 1
                    );
                }

            }

        }

        // 4. reporterHash 정보를 answer에 옮겨담기
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = reporterHash.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}
