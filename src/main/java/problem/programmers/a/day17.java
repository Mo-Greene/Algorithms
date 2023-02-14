package problem.programmers.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution17_1 {
    public static void main(String[] args) {
        Solution17_1 solution17_1 = new Solution17_1();
        System.out.println(solution17_1.solution(232443, 4));
    }

    public int solution(int num, int k) {
        String number = Integer.toString(num);
        String kk = Integer.toString(k);
        int answer = 0;

        if (!number.contains(kk)) {
            answer = -1;
        } else {
            answer = number.indexOf(kk) + 1;
        }
        return answer;
    }
}

class Solution17_2 {
    public static void main(String[] args) {
        Solution17_2 solution17_2 = new Solution17_2();
        int[] numlist = {1, 9, 3, 10, 13, 5};
        System.out.println(Arrays.toString(solution17_2.solution(5, numlist)));
    }

    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                arr.add(numlist[i]);
            }
        }
        answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

class Solution17_3 {
    public static void main(String[] args) {
        Solution17_3 solution17_3 = new Solution17_3();
        System.out.println(solution17_3.solution(930211));
    }
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

class Solution17_4 {
    public static void main(String[] args) {
        Solution17_4 solution17_4 = new Solution17_4();
        String[] quiz = {"5 + 6 = 11", "3 - 4 = -3"};
        System.out.println(Arrays.toString(solution17_4.solution(quiz)));
    }
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
//            switch (arr[1]) {
//                case "+":
//                    if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
//                        answer[i] = "O";
//                    } else if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) != Integer.parseInt(arr[4])) {
//                        answer[i] = "X";
//                    }
//                case "-":
//                    if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
//                        answer[i] = "O";
//                    } else if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) != Integer.parseInt(arr[4])) {
//                        answer[i] = "X";
//                    }
//            }

            if (arr[1].equals("+")) {
                if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else answer[i] = "X";
            } else if (arr[1].equals("-")) {
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])) {
                    answer[i] = "O";
                } else answer[i] = "X";
            }
        }
        return answer;
    }
}

public class day17 {
}
