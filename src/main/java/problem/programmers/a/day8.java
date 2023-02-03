package problem.programmers.a;

import java.util.Arrays;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/03
 * Description : 1day 1algo 프로그래머스 day 8
 */
class Solution8_1 {
    public static void main(String[] args) {
        Solution8_1 solution8_1 = new Solution8_1();

        int[] numbers = {1,3,5};
        int num1 = 1;
        int num2 = 2;

        System.out.println(Arrays.toString(solution8_1.solution(numbers, num1, num2)));
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] += numbers[i + num1];

        }
        return answer;
    }
}

class Solution8_2 {
    public static void main(String[] args) {
        Solution8_2 solution8_2 = new Solution8_2();
        System.out.println(solution8_2.solution(100));

    }

    public String solution(int age) {
        String answer = "";

        if (age == 1000) {
            answer = "baaa";
        } else if (age < 1000 && age >= 100) {
            int firstNum = age / 100;
            int secondNum = (age / 10) % 10;
            int thirdNum = (age % 100) % 10;
            answer = numConvert(firstNum) + numConvert(secondNum) + numConvert(thirdNum);
        } else if (age < 100 && age >= 10) {
            int firstNum = age / 10;
            int secondNum = age % 10;
            answer = numConvert(firstNum) + numConvert(secondNum);
        } else {
            int firstNum = age % 10;
            answer = numConvert(firstNum);
        }
        return answer;
    }

    public String numConvert(int num) {
        String name = "";
        switch (num) {
            case 0: name = "a"; break;
            case 1: name = "b"; break;
            case 2: name = "c"; break;
            case 3: name = "d"; break;
            case 4: name = "e"; break;
            case 5: name = "f"; break;
            case 6: name = "g"; break;
            case 7: name = "h"; break;
            case 8: name = "i"; break;
            case 9: name = "j"; break;
        }
        return name;
    }
}

class Solution8_3 {
    public static void main(String[] args) {
        Solution8_3 solution8_3 = new Solution8_3();
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(solution8_3.solution(emergency)));
    }

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            emer[i] = emergency[i];
        }
        Arrays.sort(emer);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emer[i] == emergency[j]) {
                    answer[j] = emergency.length - i;
                }
            }
        }
        return answer;
    }
}

class Solution8_4 {
    public static void main(String[] args) {
        Solution8_4 solution8_4 = new Solution8_4();
        System.out.println(solution8_4.solution(100));
    }

    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) {
            if (i * i == n) answer++;
            else if (n % i == 0) answer += 2;
        }
        return answer;
    }
}

public class day8 {
}
