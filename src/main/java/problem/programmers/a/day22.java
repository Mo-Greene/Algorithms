package problem.programmers.a;

class Solution22_1 {
    public static void main(String[] args) {
        Solution22_1 solution22_1 = new Solution22_1();
        System.out.println(solution22_1.solution(100));
    }
    public int solution(int n) {
        int answer = n;

        int i = 1;
        while (i <= answer) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }

        return answer;
    }
}

public class day22 {
}
