package baek.y24.m3.baek4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// TODO: 2024-03-15 Mo-Greene BufferedReader EOF Code
/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-15
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		String[] strArr;
		int[] numArr = new int[3];

		while (!(input = br.readLine()).equals("0 0 0")) {
			strArr = input.split(" ");
			makeNumArr(numArr, strArr);
			Arrays.sort(numArr);
			pythagoras(numArr);
		}
	}

	private static void pythagoras(int[] numArr) {
		long a = (long) Math.pow(numArr[0], 2);
		long b = (long) Math.pow(numArr[1], 2);
		long c = (long) Math.pow(numArr[2], 2);

		if (a + b == c) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}

	private static void makeNumArr(int[] intArr, String[] strArr) {
		intArr[0] = Integer.parseInt(strArr[0]);
		intArr[2] = Integer.parseInt(strArr[2]);
		intArr[1] = Integer.parseInt(strArr[1]);
	}
}
