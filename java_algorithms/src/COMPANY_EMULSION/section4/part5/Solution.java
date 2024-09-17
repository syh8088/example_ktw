package COMPANY_EMULSION.section4.part5;

//CPU 스케쥴링
import java.util.*;

class Solution {

    public int[] solution2(int[][] tasks) {

        int[] answer = {};



        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new int[][] {
                {2, 3},
                {1, 2},
                {8, 2},
                {3, 1},
                {10, 2}
        })));
        System.out.println(Arrays.toString(T.solution(new int[][]{{5, 2}, {7, 3}, {1, 3}, {1, 5}, {2, 2}, {1, 1}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{1, 2}, {2, 3}, {1, 3}, {3, 3}, {8, 2}, {1, 5}, {2, 2}, {1, 1}})));
        System.out.println(Arrays.toString(T.solution(new int[][]{{999, 1000}, {996, 1000}, {998, 1000}, {999, 7}})));
    }

    public int[] solution(int[][] tasks) {

        int[] answer = {};
        List<Task> taskList = new ArrayList<>();

        int length = tasks.length;
        for (int i = 0; i < length; i++) {
            int[] temp = tasks[i];
            int i1 = temp[0];
            int i2 = temp[1];
            taskList.add(new Task(i1, i2));
        }

        Collections.sort(taskList);

        int pos = 0;
        int endTaskTime = 0;
        Queue<Task> taskQueue = new LinkedList<>();
        for (int time = 0; time < 1000; time++) {

            Task task = taskList.get(pos);

            if (task.startTime == time && time >= endTaskTime) {
                pos++;
                endTaskTime = time + task.endTime;
            }
            else if (time < endTaskTime && !taskQueue.isEmpty()) {
                task = taskQueue.poll();
                pos++;
                endTaskTime = time + task.endTime;
            }
            else if (task.startTime < endTaskTime) {
                taskQueue.add(task);
                pos++;
            }
        }

        return answer;
    }

    class Task implements Comparable<Task> {
        int startTime;
        int endTime;

        public Task(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Task o) {
            return this.startTime - o.startTime;
        }
    }

}