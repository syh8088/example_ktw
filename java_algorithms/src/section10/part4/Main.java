package section10.part4;

import java.util.*;

class Lecture implements Comparable<Lecture> {

    public int money;
    public int time;

    public Lecture(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time;
    }
}

public class Main {

    static int max;

    public int solution2(int n, ArrayList<Lecture> arr) {

        int answer = 0;





        
        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();

        ArrayList<Lecture> arr = new ArrayList<>();

//        for (int i = 0; i < n; i++) {
//            int money = kb.nextInt();
//            int time = kb.nextInt();
//            arr.add(new Time(money, time));
//        }

        max = 3;
        arr.add(new Lecture(50, 2));
        arr.add(new Lecture(20, 1));
        arr.add(new Lecture(40, 2));
        arr.add(new Lecture(60, 3));
        arr.add(new Lecture(30, 3));
        arr.add(new Lecture(30, 1));

        System.out.println(T.solution2(6, arr));
    }

    /**
     *
     */
    public int solution(int n, ArrayList<Lecture> arr) {

        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) {

            for (; j < n; j++) {
                Lecture lecture = arr.get(j);
                if (lecture.time < i) {
                    break;
                }

                priorityQueue.offer(lecture.money);
            }

            if (!priorityQueue.isEmpty()) {
                answer += priorityQueue.poll();
            }
        }

        return answer;
    }
}
