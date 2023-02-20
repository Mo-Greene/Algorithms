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

class Solution20_2 {
    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};
        Solution20_2 solution20_2 = new Solution20_2();
        System.out.println(Arrays.toString(solution20_2.solution(keyinput, board)));
    }
    public int[] solution(String[] keyinput, int[] board) {
        int plusX = board[0] / 2;
        int minusX = board[0] / 2 * -1;
        int plusY = board[1] / 2;
        int minusY = board[1] / 2 * -1;

        int[] answer = {0, 0};
        for (int i = 0; i < keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up" :
                    if (answer[1] == plusY) {
                        break;
                    } else {
                        answer[1]++;
                        break;
                    }
                case "down" :
                    if (answer[1] == minusY) {
                        break;
                    } else {
                        answer[1]--;
                        break;
                    }
                case "right" :
                    if (answer[0] == plusX) {
                        break;
                    } else {
                        answer[0]++;
                        break;
                    }
                case "left" :
                    if (answer[0] == minusX) {
                        break;
                    } else {
                        answer[0]--;
                        break;
                    }
            }
        }
        return answer;
    }
}

class Solution20_3 {
    public static void main(String[] args) {
        Solution20_3 solution20_3 = new Solution20_3();
        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(solution20_3.solution(numbers));
    }
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int minus = numbers[0] * numbers[1];
        int plus = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        answer = Math.max(minus, plus);
        return answer;
    }
}

class Solution20_4 {
    public static void main(String[] args) {
        Solution20_4 solution20_4 = new Solution20_4();
        System.out.println(solution20_4.solution("3x + 7 + x"));
    }
    public String solution(String polynomial) {
        String answer = "";

        return answer;
    }
}

public class day20 {
}
