package problem.programmers.level1;

import java.util.Arrays;

class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {1,2,3,4};
        System.out.println(solution1.solution(arr));
    }
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }

        answer = (double) sum / (double) count;
        return answer;
    }
}

class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int n = 987;
        System.out.println(solution2.solution(n));
    }
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] - 48;
        }

        return answer;
    }
}

class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int n = 0;
        System.out.println(solution3.solution(n));
    }
    public int solution(int n) {
        int answer = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return n != 0 ? answer : 0;
    }
}

class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int n = 12;
        System.out.println(solution4.solution(n));
    }
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String s = "hello";
        System.out.println(solution5.solution(s));
    }
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                pCnt++;
            } else if (str.charAt(i) == 'y') {
                yCnt++;
            } else if (!str.contains("p") && !str.contains("y")){
                return true;
            }
        }

        return pCnt == yCnt;
    }
}

class Solution6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        long n = 12345;
        System.out.println(Arrays.toString(solution6.solution(n)));
    }
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];
        int count = 0;

        while (n != 0) {
            long sum = n % 10;
            answer[count] = (int) sum;
            count++;
            n = n / 10;
        }

        return answer;
    }
}

class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        long n = 121;
        System.out.println(solution7.solution(n));
    }
    public long solution(long n) {
        long answer = 0;
        float half = (float) Math.sqrt(n);

        for (int i = 0; i <= half; i++) {
            if (Math.pow(i, 2) == n) {
                answer = (long) Math.pow(i + 1, 2);
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}

class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String s = "1234";
        System.out.println(solution8.solution(s));
    }
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        long n = 118372;
        System.out.println(solution9.solution(n));
    }
    public long solution(long n) {
        long answer = 0;

        String[] digits = String.valueOf(n).split("");
        Arrays.sort(digits, (a, b) -> b.compareTo(a));

        StringBuilder sb = new StringBuilder();
        for (String digit : digits) {
            sb.append(digit);
        }

        answer = Long.parseLong(String.valueOf(sb));

        return answer;
    }
}

public class page1 {
}
