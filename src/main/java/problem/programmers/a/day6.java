package problem.programmers.a;

import java.util.Arrays;
import java.util.Scanner;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/01/31
 * Description : 프로그래머스 day6 알고리즘
 */

class Solution6_1 { //문자열 뒤집기
    public static void main(String[] args) {
        Solution6_1 sb = new Solution6_1();
        System.out.println(sb.solution("jang"));
    }
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
}

class Solution6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Solution6_3 {
    public static void main(String[] args) {
        Solution6_3 solution6_3 = new Solution6_3();
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(num));
    }

    public String solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) answer[0] += 1;
            else answer[1] += 1;
        }
        return Arrays.toString(answer);
    }
}

class Solution6_4 {
    public static void main(String[] args) {
        Solution6_4 solution6_4 = new Solution6_4();
        System.out.println(solution6_4.solution("hello", 3));
        System.out.println(solution6_4.solution("mydream", 2));
    }

    public String solution(String my_string, int n) {
        char[] chars = my_string.toCharArray();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(chars[i]);
            }
        }

        return answer.toString();
    }
}

public class day6 {
}
