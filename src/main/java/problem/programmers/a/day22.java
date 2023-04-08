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

class Solution22_2 {
    public static void main(String[] args) {
//        {{1, 4},
//            {3, 8},
//            {9, 2},
//            {11, 6}}
        Solution22_2 solution22_2 =new Solution22_2();
        int[][] dots = {{1, 4},
                        {3, 8},
                        {9, 2},
                        {11, 6}};
        System.out.println(solution22_2.solution(dots));
    }
    public int solution(int[][] dots) {
        int answer = 0;

        if( (dots[2][1]-dots[0][1])/(dots[2][0]-dots[0][0])+(dots[2][1]-dots[0][1])%(dots[2][0]-dots[0][0]) ==
                (dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]) + (dots[3][1]-dots[1][1])%(dots[3][0]-dots[1][0]) ){
            answer = 1;
        }

        return answer;
    }

//        틀린 답
//        if (dots[0][0] - dots[1][0] == dots[2][0] - dots[3][0] &&
//                dots[0][1] - dots[1][1] == dots[2][1] - dots[3][1]) {
//            answer = 1;
//        }
//        if (dots[0][0] - dots[2][0] == dots[1][0] - dots[3][0] &&
//                dots[0][1] - dots[2][1] == dots[1][1] - dots[3][1]) {
//            answer = 1;
//        }
//        if (dots[0][0] - dots[3][0] == dots[1][0] - dots[2][0] &&
//                dots[0][1] - dots[3][1] == dots[1][1] - dots[2][1]) {
//            answer = 1;
//        }
}

public class day22 {
}
