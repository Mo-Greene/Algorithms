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

class Solution23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int left = 24;
        int right = 27;
        System.out.println(solution23.solution(left, right));
    }
    public int solution(int left, int right) {
        int answer = 0;

        while (left <= right) {
            int count = 0;
            for (int j = 1; j <= left; j++) {
                if (left % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += left;
            } else {
                answer -= left;
            }
            left++;
        }

        return answer;
    }
}

class Solution24 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution24.solution(price,money,count));
    }
    public long solution(int price, int money, int count) {
        long answer;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }
        if (money - sum > 0) {
            return 0;
        }
        answer = Math.abs(money - sum);

        return answer;
    }
}

class Solution25 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        String s = "a234";
        System.out.println(solution25.solution(s));
    }
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 57 || s.charAt(i) < 48) {
                answer = false;
            }
        }
        return answer;
    }
}

public class page2 {
}
