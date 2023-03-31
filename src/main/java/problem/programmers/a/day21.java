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

        int[][] bomb = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == 1) {

                    explosion(i, j, bomb);
                }
            }
        }

        for (int i = 0; i < bomb.length; i++) {
            for (int j = 0; j < bomb[0].length; j++) {
                if (bomb[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private void explosion(int i, int j, int[][] bomb) {
        int xx = bomb.length;   //5
        int yy = bomb[0].length;    //5

        bomb[i][j] = 1;
        if (i > 0) bomb[i - 1][j] = 1;
        if (i < xx - 1) bomb[i + 1][j] = 1;
        if (j > 0) bomb[i][j - 1] = 1;
        if (j < yy - 1) bomb[i][j + 1] = 1;
        if (i > 0 && j > 0) bomb[i - 1][j - 1] = 1;
        if (i < xx - 1 && j > 0) bomb[i + 1][j - 1] = 1;
        if (i > 0 && j < yy - 1) bomb[i - 1][j + 1] = 1;
        if (i < xx - 1 && j < yy - 1) bomb[i + 1][j + 1] = 1;

    }
}

class Solution21_3 {
    public static void main(String[] args) {
        Solution21_3 solution21_3 = new Solution21_3();
        int[] sides = {11, 7};
        System.out.println(solution21_3.solution(sides));
    }

    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int min = 0;

        //주어진 값의 최대값 최소값 판별
        if (sides[0] > sides[1]) {
            max = sides[0];
            min = sides[1];
        } else {
            max = sides[1];
            min = sides[0];
        }

        answer = (max + min) - (max - min) - 1;
        return answer;
    }
}

class Solution21_4 {
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};

        Solution21_4 solution21_4 = new Solution21_4();
        System.out.println(solution21_4.solution(spell, dic));
    }
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (int i = 0; i < dic.length; i++) {
            int count = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    count++;
                }

                if (count == spell.length) {
                    answer = 1;
                    return answer;
                } else {
                    answer = 2;
                }
            }
        }
        return answer;
    }
}

public class day21 {
}
