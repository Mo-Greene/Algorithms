package problem.programmers.level1;

import java.util.*;

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

class Solution39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        int[] numbers = {5,0,2,7};
        System.out.println(Arrays.toString(solution39.solution(numbers)));
    }
    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);

        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                numSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[numSet.size()];
        List<Integer> numList = new ArrayList<>(numSet);
        for (int i = 0; i < numList.size(); i++) {
            answer[i] = numList.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
public class page3 {
}
