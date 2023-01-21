package baekjoon.problem.c;

import java.util.Scanner;

public class c2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            j = n * i;
            System.out.println(n + " * " + i + " = " + j);
            }
    }
}

/**
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 */