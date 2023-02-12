package problem.programmers.a;

import java.util.*;

/**
 * 프로그래머스 day15
 */
class Solution15_1 {
    public static void main(String[] args) {
        Solution15_1 solution15_1 = new Solution15_1();
        System.out.println(solution15_1.solution("onetwothreefourfivesixseveneightnine"));
    }

    public long solution(String numbers) {
        long answer = 0;
        String result = numbers.replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
                .replace("zero", "0");

        answer = Long.parseLong(result);
        return answer;
    }
}

class Solution15_2 {
    public static void main(String[] args) {
        Solution15_2 solution15_2 = new Solution15_2();
        System.out.println(solution15_2.solution("I love you", 3, 6));
    }
    public String solution(String my_string, int num1, int num2) {
        char[] str = my_string.toCharArray();
        char[] answer = str.clone();

        for (int i = 0; i < str.length; i++) {
            if (i == num1) {
                answer[i] = str[num2];
            }
            if (i == num2) {
                answer[i] = str[num1];
            }
        }
        Arrays.sort(answer);
        return String.valueOf(answer);
    }
}

class Solution15_3 {
    public static void main(String[] args) {
        Solution15_3 solution15_3 = new Solution15_3();
        System.out.println(solution15_3.solution("hello"));
    }

    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 1) {
                answer += (char)(i + 97);
            }
        }
        return answer;
    }
}

class Solution15_4 {
    public static void main(String[] args) {
        Solution15_4 solution15_4 = new Solution15_4();
        System.out.println(Arrays.toString(solution15_4.solution(24)));
    }

    public int[] solution(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                numbers.add(i);
            }
        }

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}

public class day15 {
}
