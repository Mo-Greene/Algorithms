package problem.baekjoon.a;

import java.util.Scanner;

/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때
 * (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
public class a2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a * (b % 10);
        int d = a * ((b / 10) % 10);
        int e = a * (b / 100);
        int f = c + (d * 10) + (e * 100);

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
