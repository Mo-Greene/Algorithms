package problem.baekjoon.e;

import java.util.Arrays;
import java.util.Scanner;

class e27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int number = sc.nextInt();

        char[] arr = str.toCharArray();
        char result = arr[number - 1];

        System.out.println(result);
    }
}

class e2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.length());
    }
}

class e9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            String str = sc.next();
            int length = str.length();

            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(length - 1));

            System.out.println(first + last);
        }
    }
}

class e11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.next().charAt(0);

        System.out.println(num);
    }
}

class e11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += str.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
