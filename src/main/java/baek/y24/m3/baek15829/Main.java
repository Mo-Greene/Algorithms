package baek.y24.m3.baek15829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-18
 */
public class Main {
	static final int M = 1234567891;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] line = br.readLine().toCharArray();
		int[] convertChar = convertChar(line);

		long result = calculateHash(N, convertChar);
		System.out.println(result);
	}

	private static long calculateHash(int n, int[] convertChar) {
		long sum = 0;
		long r = 1;
		for (int i = 0; i < n; i++) {
			sum += convertChar[i] * r % M;
			r = (r * 31) % M;
		}
		return sum;
	}

	private static int[] convertChar(char[] line) {
		int[] intArr = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			intArr[i] = line[i] - 96;
		}
		return intArr;
	}
}

