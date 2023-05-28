package problem.programmers.level1;

import java.util.Arrays;
import java.util.Stack;

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

class Solution26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Solution27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(solution27.solution(arr)));
    }
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else {
                if (stack.peek() != arr[i]) {
                    stack.push(arr[i]);
                }
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}

class Solution28 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int n = 3;
        int m = 12;
        System.out.println(Arrays.toString(solution28.solution(n, m)));
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        //최대공약수
        answer[0] = divisor(n, m);

        //최소공배수
        answer[1] = multiple(n, m, answer[0]);

        return answer;
    }

    private int divisor(int n, int m) {
        int result = 0;

        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                result = i;
            }
        }
        return result;
    }

    private int multiple(int n, int m, int divisor) {

        return (n * m) / divisor;
    }
}

class Solution29 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int n = 45;
        System.out.println(solution29.solution(n));
    }
    public int solution(int n) {
        int answer = 0;
        String conversion = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(conversion);
        String changeThree = String.valueOf(sb.reverse());
        answer = Integer.parseInt(changeThree, 3);

        return answer;
    }
}

class Solution30 {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        String s = "trY hEllo woRld";
        System.out.println(solution30.solution(s));
    }
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String sLower = s.toLowerCase();

        String[] arrs = sLower.split("");

        boolean upper = true;
        for (String arr : arrs) {
            if (upper) {
                answer.append(arr.toUpperCase());
            } else {
                answer.append(arr);
            }

            upper = !upper;
            if (arr.equals(" ")) {
                upper = true;
            }
        }

        return answer.toString();
    }
}

public class page2 {
}
