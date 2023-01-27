package baekjoon.problem.d;

import java.util.HashSet;
import java.util.Scanner;

/**
 * PackageName : baekjoon.problem.d
 * Author : Mo-Greene
 * Date : 2023/01/27
 * Description :
 */
public class d3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> arr = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int sum = a % 42;

            arr.add(sum);
        }
        System.out.println(arr.size());
    }
}
