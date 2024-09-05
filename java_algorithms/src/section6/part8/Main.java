package section6.part8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public int solution2(int n, int m, int[] arr) {

        int answer = 0;
        
        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int m = kb.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = kb.nextInt();
//        }
//        System.out.print(T.solution(n, m, arr));

        System.out.print(T.solution2(5, 2, new int[]{ 60, 50, 70, 80, 90 }));
    }

    /**
     *
     */
    public int solution(int n, int m, int[] arr) {

        int answer = 1;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while (!Q.isEmpty()) {
            Person temp = Q.poll();
            for (Person x : Q) {
                if (x.priority > temp.priority) {
                    Q.offer(temp);
                    temp = null;
                    break;
                }
            }

            if (temp != null) {
                if (temp.id == m) return answer;
                else answer++;
            }
        }

        return answer;
    }
}

class Person {

    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}