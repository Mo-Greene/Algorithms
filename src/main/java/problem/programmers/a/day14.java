package problem.programmers.a;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/08
 * Description : day14 프로그래머스
 */
class Solution14_1 {
    public static void main(String[] args) {
        Solution14_1 solution14_1 = new Solution14_1();
        int[] array = {3, 10, 28};
        System.out.println(solution14_1.solution(array, 20));
    }
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int sum = n + 100;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < sum) {
                sum = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        return answer;
    }
}

class Solution14_2 {
    public static void main(String[] args) {
        Solution14_2 solution14_2 = new Solution14_2();
        System.out.println(solution14_2.solution(33486));
    }
    public int solution(int order) {
        int answer = 0;
        int[] stream = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < stream.length; i++) {
            if (stream[i] == 3) answer++;
            else if (stream[i] == 6) answer++;
            else if (stream[i] == 9) answer++;
        }
        return answer;
    }
}

class Solution14_3 {
    public static void main(String[] args) {
        Solution14_3 solution14_3 = new Solution14_3();
        System.out.println(solution14_3.solution("dfjardstddetckdaccccdegk", 4));
    }

    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        String[] interpret = cipher.split("");

        for (int i = 0; i < interpret.length; i++) {
            if ((i + 1) % code == 0) answer.append(interpret[i]);
        }
        return answer.toString();
    }
}

class Solution14_4 {
    public static void main(String[] args) {
        Solution14_4 solution14_4 = new Solution14_4();
        System.out.println(solution14_4.solution("ABcDeFGHij"));
    }

    public String solution(String my_string) {
        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a') chars[i] = 'A';
            else if (chars[i] == 'b') chars[i] = 'B';
            else if (chars[i] == 'c') chars[i] = 'C';
            else if (chars[i] == 'd') chars[i] = 'D';
            else if (chars[i] == 'e') chars[i] = 'E';
            else if (chars[i] == 'f') chars[i] = 'F';
            else if (chars[i] == 'g') chars[i] = 'G';
            else if (chars[i] == 'h') chars[i] = 'H';
            else if (chars[i] == 'i') chars[i] = 'I';
            else if (chars[i] == 'j') chars[i] = 'J';
            else if (chars[i] == 'k') chars[i] = 'K';
            else if (chars[i] == 'l') chars[i] = 'L';
            else if (chars[i] == 'm') chars[i] = 'M';
            else if (chars[i] == 'n') chars[i] = 'N';
            else if (chars[i] == 'o') chars[i] = 'O';
            else if (chars[i] == 'p') chars[i] = 'P';
            else if (chars[i] == 'q') chars[i] = 'Q';
            else if (chars[i] == 'r') chars[i] = 'R';
            else if (chars[i] == 's') chars[i] = 'S';
            else if (chars[i] == 't') chars[i] = 'T';
            else if (chars[i] == 'u') chars[i] = 'U';
            else if (chars[i] == 'v') chars[i] = 'V';
            else if (chars[i] == 'w') chars[i] = 'W';
            else if (chars[i] == 'x') chars[i] = 'X';
            else if (chars[i] == 'y') chars[i] = 'Y';
            else if (chars[i] == 'z') chars[i] = 'Z';
            else if (chars[i] == 'A') chars[i] = 'a';
            else if (chars[i] == 'B') chars[i] = 'b';
            else if (chars[i] == 'C') chars[i] = 'c';
            else if (chars[i] == 'D') chars[i] = 'd';
            else if (chars[i] == 'E') chars[i] = 'e';
            else if (chars[i] == 'F') chars[i] = 'f';
            else if (chars[i] == 'G') chars[i] = 'g';
            else if (chars[i] == 'H') chars[i] = 'h';
            else if (chars[i] == 'I') chars[i] = 'i';
            else if (chars[i] == 'J') chars[i] = 'j';
            else if (chars[i] == 'K') chars[i] = 'k';
            else if (chars[i] == 'L') chars[i] = 'l';
            else if (chars[i] == 'M') chars[i] = 'm';
            else if (chars[i] == 'N') chars[i] = 'n';
            else if (chars[i] == 'O') chars[i] = 'o';
            else if (chars[i] == 'P') chars[i] = 'p';
            else if (chars[i] == 'Q') chars[i] = 'q';
            else if (chars[i] == 'R') chars[i] = 'r';
            else if (chars[i] == 'S') chars[i] = 's';
            else if (chars[i] == 'T') chars[i] = 't';
            else if (chars[i] == 'U') chars[i] = 'u';
            else if (chars[i] == 'V') chars[i] = 'v';
            else if (chars[i] == 'W') chars[i] = 'w';
            else if (chars[i] == 'X') chars[i] = 'x';
            else if (chars[i] == 'Y') chars[i] = 'y';
            else if (chars[i] == 'Z') chars[i] = 'z';
        }
        String answer = new String(chars);
        return answer;
    }
}

public class day14 {
}
