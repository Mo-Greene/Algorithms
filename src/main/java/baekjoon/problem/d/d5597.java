package baekjoon.problem.d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class d5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                if (Arrays.binarySearch(arr, i + 1) < 0) {
                    arr2.add(i);
                }
            }
        }
        System.out.println(arr2.get(0) + 1);
        System.out.println(arr2.get(1) + 1);
    }
}