package COMPANY_EMULSION.section3.part5;

import java.util.*;

class Solution {

    public String solution2(String[] votes, int k) {

        String answer = " ";






        
        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(T.solution2(new String[] {
                "john tom",
                "daniel luis",
                "john luis",
                "luis tom",
                "daniel tom",
                "luis john"
        }, 2));
        System.out.println(T.solution2(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution2(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution2(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }

    /**
     * 내가 푼거...... (틀린거...???)??...
     */
    public String solution(String[] votes, int k) {

        String answer;
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < votes.length; i++) {
            String vote = votes[i];
            String[] split = vote.split(" ");

            if (map.containsKey(split[1])) {
                List<String> list = map.get(split[1]);
                list.add(split[0]);
                map.put(split[1], list);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(split[0]);
                map.put(split[1], list);
            }

        }

        HashMap<String, Integer> map1 = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            if (list.size() >= k) {
                for (String vote : list) {
                    int count = map1.getOrDefault(vote, 0) + 1;
                    max = Math.max(max, count);
                    map1.put(vote, count);
                }
            }
        }

        ArrayList<String> tmp = new ArrayList<>();
        for (String name : map1.keySet()) {
            if (map1.get(name) == max) {
                tmp.add(name);
            }
        }

        tmp.sort((a, b) -> a.compareTo(b));
        answer = tmp.get(0);

        return answer;
    }
}