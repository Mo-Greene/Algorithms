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
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
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
        System.out.println(solution24.solution(price, money, count));
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
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
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

class Solution31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution31.solution(d, budget));
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            sum += d[i];

            if (sum == budget) {
                answer++;
                break;
            }
            if (sum > budget) {
                break;
            }
            answer++;
        }
        return answer;
    }
}

class Solution32 {
    public static void main(String[] args) {
        Solution32 solution32 = new Solution32();
        String s = "a B z";
        int n = 25;
        System.out.println(solution32.solution(s, n));
    }

    public String solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                answer.append(s.charAt(i));
                continue;
            }

            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                answer.append(upperLower(s.charAt(i), n, "upper"));
            }

            if (s.charAt(i) > 96 && s.charAt(i) < 123) {
                answer.append(upperLower(s.charAt(i), n, "lower"));
            }
        }

        return answer.toString();
    }

    private char upperLower(char c, int n, String upperLower) {
        char result = (char) (c + n);

        switch (upperLower) {
            case "upper":
                if (result >= 91) {
                    int sum = result - 90;
                    result = (char) (64 + sum);
                }
                break;

            case "lower":
                if (result >= 123) {
                    int sum = result - 122;
                    result = (char) (96 + sum);
                }
        }

        return result;
    }
}

class Solution33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(solution33.solution(sizes));
    }

    public int solution(int[][] sizes) {

        for (int i = 0; i < sizes.length; i++) {
            int max = sizes[i][0];
            if (sizes[i][0] < sizes[i][1]) {
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = max;
            }
        }

        int bigMax = sizes[0][0];
        for (int i = 0; i < sizes.length; i++) {
            if (bigMax < sizes[i][0]) {
                bigMax = sizes[i][0];
            }
        }

        int smallMax = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if (smallMax < sizes[i][1]) {
                smallMax = sizes[i][1];
            }
        }

        return bigMax * smallMax;
    }
}

class Solution34 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        String t = "500220839878";
        String p = "7";
        System.out.println(solution34.solution(t, p));
    }

    public int solution(String t, String p) {
        int answer = 0;
        int length = t.length() - p.length() + 1;
        long[] arr = new long[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Long.parseLong(t.substring(i, i + p.length()));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}

class Solution35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution35.solution(n, arr1, arr2)));
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        boolean[][] result = new boolean[n][n];

        int[] map1 = makeBinaryMap(arr1);
        int[] map2 = makeBinaryMap(arr2);


        return answer;
    }

    private int[] makeBinaryMap(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Integer.parseInt(Integer.toBinaryString(arr[i]));
        }

        return result;
    }
}

class Solution36 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        String s = "one4seveneight";
        System.out.println(solution36.solution(s));
    }

    public int solution(String s) {
        int answer;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replace(arr[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

public class page2 {
}
