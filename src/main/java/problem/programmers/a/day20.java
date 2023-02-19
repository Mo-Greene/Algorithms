package problem.programmers.a;

import java.util.Arrays;

class Solution20_1 {
    public static void main(String[] args) {
        Solution20_1 solution20_1 = new Solution20_1();
        int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
        System.out.println(solution20_1.solution(dots));
    }
    public int solution(int[][] dots) {
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];
        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        return w * h;
    }
}

class Solution20_3 {
    public static void main(String[] args) {
        Solution20_3 solution20_3 = new Solution20_3();
        int[] numbers = {1, 2, -3, 4, -5};
        System.out.println(solution20_3.solution(numbers));
    }
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}

public class day20 {
}
