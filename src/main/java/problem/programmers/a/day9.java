package problem.programmers.a;

import java.util.StringTokenizer;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/03
 * Description : 프로그래머스 day9
 */
class Solution9_1 {
    public static void main(String[] args) {
        Solution9_1 solution9_1 = new Solution9_1();
        System.out.println(solution9_1.solution(26));
    }
    public int solution(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
    }
}

class Solution9_2 {
    public static void main(String[] args) {
        Solution9_2 solution9_2 = new Solution9_2();
        System.out.println(solution9_2.solution(".... . .-.. .-.. ---"));
    }
    public String solution(String letter) {
        StringTokenizer tokenizer = new StringTokenizer(letter, " ");
        String[] answer = new String[tokenizer.countTokens()];
        int idx = 0;
        while (tokenizer.hasMoreTokens()) {
            answer[idx] = tokenizer.nextToken();
            idx++;
        }

        for (int i = 0; i < answer.length; i++) {
            switch (answer[i]) {
                case ".-" : answer[i] = "a"; break;
                case "-..." : answer[i] = "b"; break;
                case "-.-." : answer[i] = "c"; break;
                case "-.." : answer[i] = "d"; break;
                case "." : answer[i] = "e"; break;
                case "..-." : answer[i] = "f"; break;
                case "--." : answer[i] = "g"; break;
                case "...." : answer[i] = "h"; break;
                case ".." : answer[i] = "i"; break;
                case ".---" : answer[i] = "j"; break;
                case "-.-" : answer[i] = "k"; break;
                case ".-.." : answer[i] = "l"; break;
                case "--" : answer[i] = "m"; break;
                case "-." : answer[i] = "n"; break;
                case "---" : answer[i] = "o"; break;
                case ".--." : answer[i] = "p"; break;
                case "--.-" : answer[i] = "q"; break;
                case ".-." : answer[i] = "r"; break;
                case "..." : answer[i] = "s"; break;
                case "-" : answer[i] = "t"; break;
                case "..-" : answer[i] = "u"; break;
                case "...-" : answer[i] = "v"; break;
                case ".--" : answer[i] = "w"; break;
                case "-..-" : answer[i] = "x"; break;
                case "-.--" : answer[i] = "y"; break;
                case "--.." : answer[i] = "z"; break;
            }
        }
        String result = String.join("", answer);
        return result;
    }
}

class Solution9_3 {
    public static void main(String[] args) {
        Solution9_3 solution9_3 = new Solution9_3();
        System.out.println(solution9_3.solution("502"));
    }
    public String solution(String rsp) {
        String[] answer = rsp.split("");

        for (int i = 0; i < answer.length; i++) {
            switch (answer[i]) {
                case "0": answer[i] = "5"; break;
                case "2": answer[i] = "0"; break;
                case "5": answer[i] = "2"; break;
            }
        }
        String result = String.join("", answer);
        return result;
    }
}

class Solution9_4 {
    public static void main(String[] args) {
        Solution9_4 solution9_4 = new Solution9_4();
        System.out.println(solution9_4.solution(30, 15));
    }
    public int solution(int balls, int share) {
        return returnNum(balls, share);
    }

    private int returnNum(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return returnNum((balls - 1), (share -1)) + returnNum(balls - 1, share);
    }
}

public class day9 {
}
