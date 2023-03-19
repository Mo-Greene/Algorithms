package problem.baekjoon.fastcampus.class1;

import java.util.Scanner;

class pr2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char arr[] = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > 90) {
                arr[i] = (char) (input.charAt(i) - 32);
            } else if (input.charAt(i) <= 90) {
                arr[i] = (char) (input.charAt(i) + 32);
            }
        }

        System.out.println(arr);
    }
}

class pr1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int[] a_count = arrMaking(A);
        int[] b_count = arrMaking(B);

        int answer = 0;
        for (int i = 0; i < 26; i++) {
            if (a_count[i] > b_count[i]) {
                answer += a_count[i] - b_count[i];
            } else if (b_count[i] > a_count[i]) {
                answer += b_count[i] - a_count[i];
            }
        }
        System.out.println(answer);

    }

    protected static int[] arrMaking(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}
