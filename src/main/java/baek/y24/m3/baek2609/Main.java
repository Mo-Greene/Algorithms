package baek.y24.m3.baek2609;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-22
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		List<Integer> arr1 = maxCheck(num1);
		List<Integer> arr2 = maxCheck(num2);

		int gcd = findGCD(arr1, arr2);
		System.out.println(gcd);
		System.out.println((num1 * num2) / gcd);
	}

	private static List<Integer> maxCheck(int num) {
		List<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				arr.add(i);
			}
		}
		return arr;
	}

	private static int findGCD(List<Integer> arr1, List<Integer> arr2) {
		int gcd = 1;
		for (int i = arr1.size() - 1; i >= 0; i--) {
			for (int j = arr2.size() - 1; j >= 0; j--) {
				if (arr1.get(i).equals(arr2.get(j))) {
					gcd = arr1.get(i);
					return gcd;
				}
			}
		}
		return gcd;
	}
}
