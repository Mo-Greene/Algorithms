package problem.programmers.a;

import java.util.Arrays;
import java.util.Stack;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/08
 * Description : 프로그래머스 day13
 */
class Solution13_1 {
    public static void main(String[] args) {
        Solution13_1 solution13_1 = new Solution13_1();
        System.out.println(solution13_1.solution("-1 -2 -3 Z"));
    }

    public int solution(String s) {
        String[] tokens= s.split(" ");
        int answer = 0;

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            try {
                arr[i] = Integer.parseInt(tokens[i]);
            } catch (NumberFormatException e) {
                if (tokens[i].equals("Z")) {
                    arr[i] = -(arr[i - 1]);
                }
                continue;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}

class Solution13_2 {
    public static void main(String[] args) {
        Solution13_2 solution13_2 = new Solution13_2();
        String[] strList = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution13_2.solution(strList)));
    }

    public int[] solution(String[] strList) {
        int[] answer = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        return answer;
    }
}

class Solution13_3 {
    public static void main(String[] args) {
        Solution13_3 solution13_3 = new Solution13_3();
        System.out.println(solution13_3.solution("We are the world"));
    }

    public String solution(String my_string) {
        Stack<Character> st = new Stack<>();
        char[] chars = my_string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (!st.contains(chars[i])) {
                st.push(chars[i]);
            }
        }

        char[] result = new char[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return String.valueOf(result);
    }
}

class Solution13_4 {
    public static void main(String[] args) {
        Solution13_4 solution13_4 = new Solution13_4();
        int[] sides = {199, 72, 222};
        System.out.println(solution13_4.solution(sides));
    }

    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        answer = sides[0] + sides[1] > sides[2] ? 1 : 2;

        return answer;
    }
}

public class day13 {
}
