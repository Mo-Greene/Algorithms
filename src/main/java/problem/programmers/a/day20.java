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
        System.out.println(solution20_4.solution("x + x + x"));
    }
    public String solution(String polynomial) {
        String answer = "";

        int num = 0;
        int xNum = 0;
        //받은 문자열을 공백 기준으로 잘라서 배열로 저장
        String[] arr = polynomial.split(" ");

        for (String str : arr) {
            //배열을 돌며 단일항이 x 경우
           if (str.equals("x")) {
                xNum += 1;
                //배열을 돌며 x가 포함되어있을시 그 배열의 첫번째 숫자를 잘라서 더함
            } else if (str.contains("x")) {
                xNum += Integer.parseInt(str.substring(0, str.length() - 1));
                //만약 단일항이 + 가 아닌 숫자일 경우
            } else if (!str.equals("+")) {
               num += Integer.parseInt(str);
            }
        }

        //x가 없고 숫자항이 존재할때
        if (xNum == 0 && num != 0) {
            answer = String.valueOf(num);
        }
        //x항만 존재하고 숫자항이 없을때
        if (xNum != 0 && num == 0) {
            if (xNum == 1) {
                answer = "x";
            } else {
                answer = xNum + "x";
            }
        }
        //둘다 존재 할때
        if (xNum != 0 && num != 0) {
            if (xNum == 1) {
                answer = "x + " + num;
            } else {
                answer = xNum + "x + " + num;
            }
        }
        return answer;
    }
}

public class day20 {
}
