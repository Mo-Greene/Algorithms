package problem.programmers.course;

public class Day25 {
	public static void main(String[] args) {
		Day25Solution solution = new Day25Solution();
		System.out.println(solution.solution("abca", "abca"));
	}

	static class Day25Solution {
		public int solution(String A, String B) {
			int answer = 0;

			while (true) {
				if (A.equals(B)) {
					break;
				}

				StringBuilder sb = new StringBuilder();
				answer++;

				if (answer == A.length()) {
					answer = -1;
					break;
				}

				for (int i = 0; i < A.length(); i++) {
					char c = A.charAt(i);
					if (i == A.length() - 1) {
						sb.insert(0, c);
						A = sb.toString();
					} else {
						sb.append(c);
					}
				}
				if (sb.toString().equals(B)) {
					break;
				}
			}
			return answer;
		}
	}
}
