package problem.programmers.a;

import java.util.Arrays;

class Solution18_1 {
    public static void main(String[] args) {
        Solution18_1 solution18_1 = new Solution18_1();
        System.out.println(solution18_1.solution("ppprrrogrammers", "pppp"));
    }
    public int solution(String str1, String str2) {
        int answer = 0;
        String pStr = str1;
        String sStr = str2;
        if (pStr.contains(sStr)) {
            answer = 1;
        } else answer = 2;
        return answer;
    }
}

class Solution18_2 {
    public static void main(String[] args) {
        Solution18_2 solution18_2 = new Solution18_2();
        System.out.println(solution18_2.solution(144));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (i * i == n) {
                answer = 1;
                break;
            } else answer = 2;
        }
        return answer;
    }
}

class Solution18_3 {
    public static void main(String[] args) {
        Solution18_3 solution18_3 = new Solution18_3();
        System.out.println(solution18_3.solution(2, 10));
    }
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 1; i <= t; i++) {
            answer = answer * 2;
        }
        return answer;
    }
}

class Solution18_4 {
    public static void main(String[] args) {
        Solution18_4 solution18_4 = new Solution18_4();
        System.out.println(solution18_4.solution("heLLo"));
    }
    public String solution(String my_string) {
        String[] answer = my_string.toLowerCase().split("");
        Arrays.sort(answer);

        return String.join("", answer);
    }
}

public class day18 {
}
