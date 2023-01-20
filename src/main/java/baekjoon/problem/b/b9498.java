package baekjoon.problem.b;

import java.util.Scanner;

/**
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
public class b9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (90 <= a) {
            System.out.println("A");
        } else if (80 <= a) {
            System.out.println("B");
        } else if (70 <= a) {
            System.out.println("C");
        } else if (60 <= a) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
