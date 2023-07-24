package problem.baekjoon.f;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fChallenger {
}

class e9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (num != -1) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }

            int sum = 0;
            List<Integer> numList = new ArrayList<>();
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    numList.add(i);
                    sum += i;
                }
            }

            if (sum != num) {
                System.out.println(num + " is NOT perfect.");
            } else {
                System.out.printf(num + " = " + numList.get(0));
                for (int i = 1; i < numList.size(); i++) {
                    System.out.printf(" + ");
                    System.out.printf(String.valueOf(numList.get(i)));
                }
            }
        }
    }
}
