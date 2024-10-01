package problem.programmers.course;

public class Day0930 {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] common = {1, 2, 3, 4};
//		int[] common = {2, 4, 8};
		int answer = solution.solution(common);
		System.out.println("answer = " + answer);
	}

	static class Solution {
		public int solution(int[] common) {
			int answer = 0;

			if (common[2] - common[1] != common[1] - common[0]) {
				//등비수열
				int geom = common[1] / common[0];
				answer = common[common.length - 1] * geom;
			} else {
				//등차수열
				answer = common[common.length - 1] + (common[1] - common[0]);
			}
			return answer;
		}
	}
}
