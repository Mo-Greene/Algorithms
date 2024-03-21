package baek.y24.m3.baek2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-21
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int result = 0;
		for (int i = 0; i < N; i++) {
			result = i + sumDigitNumber(i);
			if (result == N) {
				System.out.println(i);
				break;
			}
			if (i == N - 1) {
				System.out.println(0);
			}
		}
	}

	private static int sumDigitNumber(int i) {
		int sumDigitNumber = 0;

		while (i != 0) {
			sumDigitNumber += i % 10;
			i = i / 10;
		}
		return sumDigitNumber;
	}
}
