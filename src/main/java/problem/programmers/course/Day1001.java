package problem.programmers.course;

public class Day1001 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution(3, 12);
	}

	static class Solution {
		public int[] solution(int num, int total) {
			int[] answer = new int[num];

			int start = (total - num * (num - 1) / 2) / num;

			for (int i = 0; i < num; i++) {
				answer[i] = start + i;
			}
			return answer;
		}
	}
}
