package problem.programmers.a;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/01/31
 * Description : 프로그래머스 day5 알고리즘
 */
class Solution5_1 {
    public int solution(int price) {
        int answer = 0;
        double realPrice = 0;
        if (price >= 150000 && price < 300000){
            realPrice = price * 0.95;
        } else if (price >= 300000 && price < 500000) {
            realPrice = price * 0.9;
        } else if (price >= 500000){
            realPrice = price * 0.8;
        }
        return (int) realPrice;
    }
}

class Solution5_2 {
    public int[] solution(int money) {
        int[] answer = new int[2];
        if (money % 5500 == 0){
            answer[0] = money / 5500;
            answer[1] = money % 5500;
        } else {
            answer[0] = money / 5500;
            answer[1] = money % 5500;
        }
        return answer;
    }
}

class Solution5_3 {
    public int solution(int age) {
        return (2022 - age) + 1;
    }
}

class Solution5_4 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++){
            answer[num_list.length - 1 - i] = num_list[i];
        }
        return answer;
    }
}

public class day4 {
}
