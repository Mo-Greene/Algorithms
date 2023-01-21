package baekjoon.problem.c;

import java.util.Scanner;

public class c2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";

        for (int i = 0; i < n; i++) {
            String format = String.format("%" + n + "s", star);
            System.out.println(format);
            star += "*";
        }
    }
}
