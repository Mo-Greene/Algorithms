package problem.programmers.a;

import java.util.*;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/02/07
 * Description :
 */
class Solution12_1 {
    public static void main(String[] args) {
        Solution12_1 solution12_1 = new Solution12_1();
        System.out.println(solution12_1.solution("nice to meet you"));
    }
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}

class Solution12_2 {
    public static void main(String[] args) {
        Solution12_2 solution12_2 = new Solution12_2();
        System.out.println(Arrays.toString(solution12_2.solution("hi13292")));
    }
    public int[] solution(String my_string) {
        return Arrays.stream(my_string.split(""))
                .filter(i -> i.matches("[0-9]"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }
}

class Solution12_3 {
    public static void main(String[] args) {
        Solution12_3 solution12_3 = new Solution12_3();
        System.out.println(solution12_3.solution("aAb1B2cC34oOp"));
    }
    public int solution(String my_string) {
        int answer = 0;
        String my = my_string.replaceAll("[a-z,A-Z]","");
        char[] arr = my.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(String.valueOf(arr[i]));
        }
        return answer;
    }
}

class Solution12_4 {
    public static void main(String[] args) {
        Solution12_4 solution12_4 = new Solution12_4();
        System.out.println(Arrays.toString(solution12_4.solution(420)));
    }
    public Integer[] solution(int n) {
        Set<Integer> num = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                num.add(i);
                n = n / i;
            }
        }
        Integer[] answer = num.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}

public class day12 {
}
