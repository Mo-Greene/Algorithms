package problem.programmers.a;

import java.util.Arrays;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/06
 * Description : 프로그래머스 day11
 */

class Solution11_1 {
    public static void main(String[] args) {
        Solution11_1 solution11_1 = new Solution11_1();
        int[] box = {10, 8, 6};
        System.out.println(solution11_1.solution(box, 3));
    }

    public int solution(int[] box, int n) {
        int length = box[0] / n;
        int width = box[1] / n;
        int height = box[2] / n;
        int answer = length * width * height;

        return answer;
    }
}

class Solution11_2 {
    public static void main(String[] args) {
        Solution11_2 solution11_2 = new Solution11_2();
        System.out.println(solution11_2.solution(10));
    }

    public int solution(int n) {
        int[] prime = new int[n + 1];
        prime[1] = 1;

        for (int i = 2; i <= n; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = i * i; j <= n; j += i) {
                prime[j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] != 0) {
                count++;
            }
        }
        return n - count;
    }
}

class Solution11_3 {
    public static void main(String[] args) {
        Solution11_3 solution11_3 = new Solution11_3();
        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(solution11_3.solution(numbers));
    }

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int max = numbers[numbers.length - 1];
        int secondMax = numbers[numbers.length - 2];

        int answer = max * secondMax;

        return answer;
    }
}

class Solution11_4 {
    public static void main(String[] args) {
        Solution11_4 solution11_4 = new Solution11_4();
        System.out.println(solution11_4.solution(3628700));
    }

    public int solution(int n) {
        int num = 1;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            num *= i;
            if (num > n) {
                break;
            }
            count++;
        }
        return count;
    }
}

public class day11 {
}
