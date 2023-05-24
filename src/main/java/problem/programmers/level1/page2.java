package problem.programmers.level1;

import java.util.Arrays;

class Solution19 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        String s = "qwerty";
        System.out.println(solution19.solution(s));
    }
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) {
            answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        } else {
            answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
        }
        return answer;
    }
}

class Solution20 {
    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        int n = 4;
        System.out.println(solution20.solution(n));
    }
    public String solution(int n) {
        String answer = "";

        if (n % 2 == 0) {
            answer = checkOddEven(n);
        } else {
            answer = checkOddEven(n);
        }
        return answer;
    }

    String checkOddEven(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }
}

class Solution21 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        System.out.println(solution21.solution(a, b));
    }
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] * b[i];
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }
}

class Solution22 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        String s = "Zbcdefg";
        System.out.println(solution22.solution(s));
    }
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char aaa = s.charAt(i);
            if (aaa > 96) {
                System.out.println(aaa);
            } else if (aaa > 64 && aaa < 91) {
                System.out.println(aaa);
            }
        }

        return answer;
    }
}
public class page2 {
}
