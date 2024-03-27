package baek.y24.m3.programmers.day27;

/**
 * @Project : algorithm
 * @Developer : Mo-Greene
 * @Date : 2024-03-27
 * @Description :
 */
public class Begginer {
	public static void main(String[] args) {

		Solution solution = new Solution();
		solution.solution(144);
	}
}

class Solution {
	public long solution(long n) {
		double sqrt = Math.sqrt(n);
		if (sqrt == Math.floor(sqrt)) {
			sqrt ++;
			return (long) Math.pow(sqrt, 2);
		} else {
			return -1;
		}
	}
}