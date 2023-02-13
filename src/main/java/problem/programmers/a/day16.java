package problem.programmers.a;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 프로그래머스 day16
 */
class Solution16_1 {
    public static void main(String[] args) {
        Solution16_1 solution16_1 = new Solution16_1();
        System.out.println(solution16_1.solution("happy birthday!"));
    }

    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}

class Solution16_2 {
    public static void main(String[] args) {
        Solution16_2 solution16_2 = new Solution16_2();
        int[] array = {1, 8, 3};
        String answer = Arrays.toString(solution16_2.solution(array));
        System.out.println(answer);
    }

    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
            answer[0] = max;
            answer[1] = index;
        }

        return answer;
    }
}

class Solution16_3 {
    public static void main(String[] args) {
        Solution16_3 solution16_3 = new Solution16_3();
        System.out.println(solution16_3.solution("3 - 4"));
    }

    public int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            } else if (arr[i].equals("-")) {
                answer -= Integer.parseInt(arr[i + 1]);
            }
            if (!arr[i].equals("+") && !arr[i].equals("-")) {
                continue;
            }
        }
        return answer;
    }
}

class Solution16_4 {
    public static void main(String[] args) {
        Solution16_4 solution16_4 = new Solution16_4();
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};
        System.out.println(solution16_4.solution(s1, s2));
    }

    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class day16 {
}
