package problem.programmers.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution19_1 {
    public static void main(String[] args) {
        Solution19_1 solution19_1 = new Solution19_1();
        int[] array = {10, 29};
        System.out.println(solution19_1.solution(array));
    }
    public int solution(int[] array) {
        int answer = 0;
        String[] strArr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            strArr[i] = String.valueOf(array[i]);
            int length = strArr[i].length();
            int seven = strArr[i].replace("7", "").length();
            answer += length - seven;
        }

        return answer;
    }
}

class Solution19_2 {
    public static void main(String[] args) {
        Solution19_2 solution19_2 = new Solution19_2();
        System.out.println(Arrays.toString(solution19_2.solution("abc1Addfggg4556b", 6)));
    }
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int) Math.ceil((double) my_str.length() / n)];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_str.substring(n * i, (i == answer.length - 1) ? my_str.length() : n * i + n);
        }
        return answer;
    }
}

public class day19 {
}
