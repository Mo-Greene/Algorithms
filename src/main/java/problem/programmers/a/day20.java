package problem.programmers.a;

import java.util.Arrays;

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
