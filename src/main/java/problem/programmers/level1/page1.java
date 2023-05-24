package problem.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution1 {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] arr = {1,2,3,4};
        System.out.println(solution1.solution(arr));
    }
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }

        answer = (double) sum / (double) count;
        return answer;
    }
}

class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int n = 987;
        System.out.println(solution2.solution(n));
    }
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] - 48;
        }

        return answer;
    }
}

class Solution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int n = 0;
        System.out.println(solution3.solution(n));
    }
    public int solution(int n) {
        int answer = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return n != 0 ? answer : 0;
    }
}

class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int n = 12;
        System.out.println(solution4.solution(n));
    }
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String s = "hello";
        System.out.println(solution5.solution(s));
    }
    boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
        String str = s.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p') {
                pCnt++;
            } else if (str.charAt(i) == 'y') {
                yCnt++;
            } else if (!str.contains("p") && !str.contains("y")){
                return true;
            }
        }

        return pCnt == yCnt;
    }
}

class Solution6 {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        long n = 12345;
        System.out.println(Arrays.toString(solution6.solution(n)));
    }
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];
        int count = 0;

        while (n != 0) {
            long sum = n % 10;
            answer[count] = (int) sum;
            count++;
            n = n / 10;
        }

        return answer;
    }
}

class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        long n = 121;
        System.out.println(solution7.solution(n));
    }
    public long solution(long n) {
        long answer = 0;
        float half = (float) Math.sqrt(n);

        for (int i = 0; i <= half; i++) {
            if (Math.pow(i, 2) == n) {
                answer = (long) Math.pow(i + 1, 2);
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}

class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        String s = "1234";
        System.out.println(solution8.solution(s));
    }
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}

class Solution9 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        long n = 118372;
        System.out.println(solution9.solution(n));
    }
    public long solution(long n) {
        long answer = 0;

        String[] digits = String.valueOf(n).split("");
        Arrays.sort(digits, (a, b) -> b.compareTo(a));

        StringBuilder sb = new StringBuilder();
        for (String digit : digits) {
            sb.append(digit);
        }

        answer = Long.parseLong(String.valueOf(sb));

        return answer;
    }
}

class Solution10 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int x = 12;
        System.out.println(solution10.solution(x));
    }
    public boolean solution(int x) {
        boolean answer;
        int sum = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 48;
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}

class Solution11 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        int a = 5;
        int b = 3;
        System.out.println(solution11.solution(a, b));
    }
    public long solution(int a, int b) {
        long answer = 0;
        int[] arr = {a, b};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[1];

        for (int i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }
}

class Solution12 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int num = 6;
        System.out.println(solution12.solution(num));
    }
    public int solution(int num) {
        int cnt = 0;
        if (num == 1) {
            return 0;
        }
        long parsing = num;

        for (int i = 1; i <= 500; i++) {
            if (parsing == 1) {
                return cnt;
            }
            if (parsing % 2 == 0) {
                parsing = even(parsing);
            } else {
                parsing = odd(parsing);
            }
            cnt++;
        }

        if (cnt == 500) {
            return -1;
        }

        return cnt;
    }

    private long even(long num) {
        return num / 2;
    }

    private long odd(long num) {
        return (num * 3) + 1;
    }
}

class Solution13 {
    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution13.solution(seoul));
    }
    public String solution(String[] seoul) {
        int kimLocation = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                kimLocation = i;
            }
        }
        return "김서방은 " + kimLocation + "에 있다";
    }
}

class Solution14 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        int[] arr = {10, 9, 7, 5};
        int divisor = 5;
        System.out.println(Arrays.toString(solution14.solution(arr, divisor)));
    }
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList<>();
        int[] noSize = {-1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                arrList.add(arr[i]);
            }
        }
        if (arrList.size() == 0) {
            return noSize;
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}

class Solution15 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        String phoneNumber = "01033334444";
        System.out.println(solution15.solution(phoneNumber));
    }
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);
        String reverse = sb.reverse().toString();
        String[] arr = reverse.split("");

        for (int i = 4; i < arr.length; i++) {
            arr[i] = arr[i].replace(arr[i], "*");
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb2.append(arr[i]);
        }

        return sb2.reverse().toString();
    }
}

class Solution16 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution16.solution(absolutes, signs));
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

class Solution17 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution17.solution(numbers));
    }
    public int solution(int[] numbers) {
        int answer = 45;

        for (int i = 0; i < numbers.length; i++) {
            answer -= numbers[i];
        }
        return answer;
    }
}

class Solution18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int[] arr = {4,3,1,2};
        System.out.println(Arrays.toString(solution18.solution(arr)));
    }
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }

        int min = arrList.get(0);
        int index = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if (min > arrList.get(i)) {
                min = arrList.get(i);
                index = i;
            }
        }
        arrList.remove(index);
        int[] answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}

public class page1 {
}
