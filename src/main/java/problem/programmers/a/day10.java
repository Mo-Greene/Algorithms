package problem.programmers.a;

import java.util.Arrays;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/05
 * Description : 프로그래머스 day10
 */
class Solution10_1 {
    public static void main(String[] args) {
        Solution10_1 solution10_1 = new Solution10_1();
        int[] dot = {-7, 9};
        System.out.println(solution10_1.solution(dot));
    }

    public int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) answer = 1;
        else if (dot[0] < 0 && dot[1] > 0) answer = 2;
        else if (dot[0] < 0 && dot[1] < 0) answer = 3;
        else if (dot[0] > 0 && dot[1] < 0)answer = 4;

        return answer;
    }
}

class Solution10_2 {
    public static void main(String[] args) {
        Solution10_2 solution10_2 = new Solution10_2();
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.deepToString(solution10_2.solution(num_list, 2)));
    }

    public int[][] solution(int[] num_list, int n) {
        int rows = num_list.length % n != 0 ? num_list.length / n + 1 : num_list.length / n;
        int[][] answer = new int[rows][n];

        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[k++];
            }
        }
        return answer;
    }
}

class Solution10_3 {
    public static void main(String[] args) {
        Solution10_3 solution10_3 = new Solution10_3();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(solution10_3.solution(numbers, 1));
    }
    public int solution(int[] numbers, int k) {
        return numbers[2 * (k - 1) % numbers.length];
    }
}

class Solution10_4 {
    public static void main(String[] args) {
        Solution10_4 solution10_4 = new Solution10_4();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(solution10_4.solution(numbers, "left")));
    }

    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        switch (direction) {
            case "right":
                int last = numbers[numbers.length - 1];
                int[] arr1 = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    arr1[i] = numbers[i];
                }
                int[] result1 = new int[numbers.length];
                for (int i = 0; i < arr1.length; i++) {
                    result1[i + 1] = arr1[i];
                    result1[0] = last;
                }
                answer = result1;
                break;

            case "left":
                int first = numbers[0];

                int[] arr2 = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    arr2[i] = numbers[i + 1];
                }
                int[] result2 = new int[numbers.length];
                for (int i = 0; i < arr2.length; i++) {
                    result2[i] = arr2[i];
                    result2[result2.length - 1] = first;
                }
                answer = result2;
                break;
        }
        return answer;
    }
}

public class day10 {
}
