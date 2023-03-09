package problem.programmers.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution21_1 {
    public static void main(String[] args) {
        Solution21_1 solution21_1 = new Solution21_1();
        System.out.println(solution21_1.solution("aAb1B2cC34oOp"));
    }
    public int solution(String my_string) {
        int answer = 0;
        String[] result = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals("")) {
                list.add(Integer.valueOf(result[i]));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}

class Solution21_2 {
    public static void main(String[] args) {
        Solution21_2 solution21_2 = new Solution21_2();
        int[][] board = {{0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 0, 0, 0},
                         {0, 0, 1, 0, 0},
                         {0, 0, 0, 0, 0}};
        System.out.println(solution21_2.solution(board));
    }
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] arr = new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) {
                    arr[i][j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j]) {
                    if (i > 0 && i < arr.length - 1 || j > 0 && j < arr.length - 1) {
                        arr[i - 1][j + 1] = true;
                        arr[i][j + 1] = true;
                        arr[i + 1][j + 1] = true;
                        arr[i - 1][j] = true;
                        arr[i + 1][j] = true;
                        arr[i - 1][j - 1] = true;
                        arr[i][j - 1] = true;
                        arr[i + 1][j - 1] = true;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class day21 {
}
