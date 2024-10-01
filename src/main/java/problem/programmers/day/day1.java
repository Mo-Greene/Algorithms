package problem.programmers.day;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for (int i = 0; i < a.length(); i++) {
			char cha = a.charAt(i);
			if (Character.isLowerCase(cha)) {
				cha = Character.toUpperCase(cha);
				System.out.printf(String.valueOf(cha));
			} else {
				cha = Character.toLowerCase(cha);
				System.out.printf(String.valueOf(cha));
			}
		}
	}
}

class Solution2 {
	public static void main(String[] args) {
		System.out.println("!@#$%^&*(\\'\"<>?:;");
	}
}

class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}

class Solution12 {
	public static void main(String[] args) {
		Solution12 solution12 = new Solution12();
		String[] id_pw = {"abc04", "345"};
		String[][] db = {{"abc04", "335"},{"abc03", "345"}};
		String answer = solution12.solution(id_pw, db);
		System.out.println("answer = " + answer);
	}

	public String solution(String[] id_pw, String[][] db) {
		String id = id_pw[0];
		String pw = id_pw[1];

		return Arrays.stream(db)
			.filter(string -> string[0].equals(id))
			.findFirst()
			.map(string -> string[1].equals(pw) ? "login" : "wrong pw")
			.orElse("fail");
	}
}

class Solution232 {
	public static void main(String[] args) {
		Solution232 solution232 = new Solution232();
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		solution232.solution(score);
	}

	public int[] solution(int[][] score) {
		List<Integer> average = new ArrayList<>();

		//평점 계산
		for (int[] intArr : score) {
			int averageScore = (intArr[0] + intArr[1]) / 2;
			average.add(averageScore);
		}

		//평점 순서 세우기


		return null;
	}
}

public class day1 {
}
