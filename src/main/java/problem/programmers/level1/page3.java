package problem.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution37 {
    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        String[] strings = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution37.solution(strings, 1)));
    }
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        for (String str : strings) {
            char chars = str.charAt(n);
            System.out.println(chars);
        }
        return answer;
    }
}

class Solution38 {
    public static void main(String[] args) {
        Solution38 solution38 = new Solution38();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution38.solution(array, commands)));
    }
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0;
        int end = 0;

        for (int i = 0; i < commands.length; i++) {
            List<Integer> arrList = new ArrayList<>();
            start = commands[i][0];
            end = commands[i][1];
            System.out.println("start : " + start);
            System.out.println("end : " + end);

            //array[start - 1] 부터 array[end - 1] 까지 넣자 어디에? arrList 에
            for (int j = start - 1; j < end; j++) {
                arrList.add(array[j]);
            }
            //넣은 arrList를 정렬해야됨
            Collections.sort(arrList);

            //arrList의 commands[i][2]를 뽑아서 answer 배열에 넣자 인덱스 생각해서 -1
            if (commands[i][2] == 1) {
                answer[i] = arrList.get(0);
            } else {
                answer[i] = arrList.get(commands[i][2] - 1);
            }
        }
        return answer;
    }
}

public class page3 {
}
