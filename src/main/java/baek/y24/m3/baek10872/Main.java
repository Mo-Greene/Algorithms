package baek.y24.m3.baek10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = n;
        if (n == 0) {
            System.out.println(1);
        } else {
            for (int i = n - 1; i > 0; i--) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
