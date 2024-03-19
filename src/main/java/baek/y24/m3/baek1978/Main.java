package baek.y24.m3.baek1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-20
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("1")) {
				continue;
			}

			if (checkPrime(arr[i])) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean checkPrime(String number) {
		int num = Integer.parseInt(number);

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
