package baek.y24.m3.programmers.day27;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-27
 * @Description : 최댓값 최솟값
 */
public class Middler {
	public static void main(String[] args) {
		Solution1 solution1 = new Solution1();
		solution1.solution("-1 -2 -3 -4");
	}
}

class Solution1 {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		String[] arr = s.split(" ");
		int min = Integer.parseInt(arr[0]);
		for (String value : arr) {
			if (min > Integer.parseInt(value)) {
				min = Integer.parseInt(value);
			}
		}
		int max = Integer.parseInt(arr[0]);
		for (String string : arr) {
			if (max < Integer.parseInt(string)) {
				max = Integer.parseInt(string);
			}
		}
		sb.append(min).append(" ");
		sb.append(max);
		return sb.toString();
	}
}