package problem.programmers.level2;

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
        System.out.println(solution2.solution(h));
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
}

public class per70 {
}
