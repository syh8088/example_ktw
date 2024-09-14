package COMPANY_EMULSION.section3.part5.solution;

import java.util.*;

class Solution {

    public String solution(String[] votes, int k) {
        String answer = " ";
        HashMap<String, HashSet<String>> voteHash = new HashMap<>();
        HashMap<String, Integer> candidate = new HashMap<>();
        HashMap<String, Integer> present = new HashMap<>();

        for (String x : votes) {

            String a = x.split(" ")[0]; // 추천을 한 사람
            String b = x.split(" ")[1]; // 추천을 받을 사람

            voteHash.putIfAbsent(a, new HashSet<>());
            voteHash.get(a).add(b);
            candidate.put(b, candidate.getOrDefault(b, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (String key : voteHash.keySet()) {
            int cnt = 0;
            for (String target : voteHash.get(key)) {
                if (candidate.get(target) >= k) {
                    cnt++;
                }
            }

            present.put(key, cnt);
            max = Math.max(max, cnt);
        }

        ArrayList<String> tmp = new ArrayList<>();
        for (String name : present.keySet()) {
            if (present.get(name) == max) {
                tmp.add(name);
            }
        }

        tmp.sort((a, b) -> a.compareTo(b));
        answer = tmp.get(0);

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution(new String[] {
                "john tom",
                "daniel luis",
                "john luis",
                "luis tom",
                "daniel tom",
                "luis john"
        }, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}