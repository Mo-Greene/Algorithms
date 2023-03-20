package problem.baekjoon.fastcampus.class1;

import java.util.Scanner;

public class problem2 {
}

class pr1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String str = input.toUpperCase();
        int[] str_count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            str_count[str.charAt(i) - 'A']++;
        }

        int max = 0;
        int answer = 0;
        int count = 0;
        char result = 0;
        for (int i = 0; i < str_count.length; i++) {
            if (max < str_count[i]) {
                max = str_count[i];
                answer = i;
            }
        }
        for (int i = 0; i < str_count.length; i++) {
            if (str_count[i] == max) {
                count++;
            }
        }
        if (count >= 2) {
            result = '?';
        } else {
            result = (char) ('A' + answer);
        }
        System.out.println(result);
    }
}
