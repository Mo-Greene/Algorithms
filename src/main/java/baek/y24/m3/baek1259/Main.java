package baek.y24.m3.baek1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-19
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		while (!(input = br.readLine()).equals("0")) {
			String[] arr = input.split("");
			StringBuilder sb = new StringBuilder();

			for (int i = arr.length - 1; i >= 0; i--) {
				sb.append(arr[i]);
			}

			if (!input.contentEquals(sb)) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}
}
