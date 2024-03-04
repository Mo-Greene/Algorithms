package baek.y24.m3.baek2420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long result = num1 - num2;
        if (result < 0) {
            System.out.println(result * -1);
        } else {
            System.out.println(result);
        }
    }
}
