package problem.programmers.level2;

import java.util.*;
import java.util.StringTokenizer;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "1 2 3 4";
        solution.solution(s);
    }

    public String solution(String s) {        String[] arrayWord = s.split(" ");
        int max = Integer.parseInt(arrayWord[0]);
        for (int i = 0; i < arrayWord.length; i++) {
            if (max < Integer.parseInt(arrayWord[i])) {
                max = Integer.parseInt(arrayWord[i]);
            }
        }

        int min = Integer.parseInt(arrayWord[0]);
        for (int i = 0; i < arrayWord.length; i++) {
            if (min > Integer.parseInt(arrayWord[i])) {
                min = Integer.parseInt(arrayWord[i]);
            }
        }

        return min + " " + max;
    }
}

class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        String s = "for tHe laSt week";
        String n = "3people Unfollowed Me";
        String a = "hello  world";
        String h = "a aA";
        String g = " aa aA";
        System.out.println(solution2.solution2(g));

    }

    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ", true);
        StringBuilder sb = new StringBuilder();

        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (str.startsWith(" ")) {
                sb.append(str);
                continue;
            }
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                sb.append(str.charAt(0));
            } else if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
                sb.append((char) (str.charAt(0) - 32));
            } else {
                sb.append(str.charAt(0));
            }
            sb.append(str.substring(1).toLowerCase());
        }

        return sb.toString();
    }

    public String solution2(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split(" ");
        System.out.println(Arrays.toString(str));
        boolean flag = true;

        for (String ss : str) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ");
        }
        return answer;
    }
}

class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] A = {1, 2};
        int[] B = {3, 4};
        System.out.println(solution3.solution(A, B));
    }
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < B.length / 2; i++) {
            int temp = B[i];
            B[i] = B[B.length - i - 1];
            B[B.length - i - 1] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }

        return answer;
    }
}

class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String s = ")())(()";
        System.out.println(solution4.solution(s));
    }
    boolean solution(String s) {
        if (s.charAt(0) == ')') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }

        if (stack.size() > 0) {
            return false;
        }

        return true;
    }
}

class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String s = "110010101001";
        System.out.println("result! : " + Arrays.toString(solution5.solution(s)));
    }
    public int[] solution(String s) {

        int calcCount = 0;
        int zeroCount = 0;

        return binaryCalc(s, calcCount, zeroCount);
    }

    private int[] binaryCalc(String s, int calcCount, int zeroCount) {

        int[] result = {};

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                zeroCount++;
            }
        }

        String replaceStr = s.replace("0","");
        int length = replaceStr.length();
        String binaryString = Integer.toBinaryString(length);

        calcCount += 1;

        if (binaryString.equals("1")) {
            result = new int[]{calcCount, zeroCount};
            return result;
        }

        return binaryCalc(binaryString, calcCount, zeroCount);
    }
}

public class per70 {
}
