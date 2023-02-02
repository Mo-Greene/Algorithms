package problem.programmers.a;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/02
 * Description : 프로그래머스 Day7
 */
class Solution7_1 {
    public static void main(String[] args) {
        Solution7_1 solution7_1 = new Solution7_1();
        System.out.println(solution7_1.solution("abcdef", "f"));
    }

    public String solution(String my_string, String letter) {
        String str = my_string;
        String remove = letter;

        for (char c : remove.toCharArray()) {
            str = str.replace(String.valueOf(c),"");
        }
        return str;
    }
}

class Solution7_2 {
    public static void main(String[] args) {
        Solution7_2 solution7_2 = new Solution7_2();
        System.out.println(solution7_2.solution(70));
    }

    public int solution(int angle) {
        int answer = angle;
        int result = 0;
        if (answer > 0 && answer < 90) {
            result = 1;
        } else if (answer == 90) {
            result = 2;
        } else if (answer > 90 && answer < 180) {
            result = 3;
        } else if (answer == 180) {
            result = 4;
        }

        return result;
    }
}

class Solution7_3 {
    public static void main(String[] args) {
        Solution7_3 solution7_3 = new Solution7_3();
        System.out.println(solution7_3.solution(10, 3));
    }

    public int solution(int n, int k) {
        int meatPrice = 12000 * n;
        int drinkPrice = 2000 * k;
        int discount = 0;
        int answer = meatPrice + drinkPrice;
        if (n >= 10) {
            discount = n / 10;
            answer = meatPrice + (2000 * (k - discount));
        }

        return answer;
    }
}

class Solution7_4 {
    public static void main(String[] args) {
        Solution7_4 solution7_4 = new Solution7_4();
        System.out.println(solution7_4.solution(10));
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

public class day7 {
}
