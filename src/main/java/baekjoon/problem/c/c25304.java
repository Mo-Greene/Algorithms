package baekjoon.problem.c;

import java.util.Scanner;

public class c25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();

        int totalPrice = 0;
        for (int i = 1; i <= num; i++) {
            int price = sc.nextInt();
            int object = sc.nextInt();

            totalPrice += price * object;
        }
        if (totalPrice == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
