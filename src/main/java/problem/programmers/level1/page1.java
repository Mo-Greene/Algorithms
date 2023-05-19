package problem.programmers.level1;

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

public class page1 {
}
