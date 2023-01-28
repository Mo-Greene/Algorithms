package problem.baekjoon.c;

import java.util.Scanner;

public class c10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean stop = false;
        int sum = 0;
        while (!stop) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            if (sum != 0) {
                System.out.println(sum);
            } else if (a == 0 && b == 0){
                break;
            }
        }
    }
}
