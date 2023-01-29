package problem.programmers.a;

/**
 * PackageName : problem.programmers.a
 * Author : Mo-Greene
 * Date : 2023/01/29
 * Description :
 */
class a3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 4};
        int answer = 0;
        int[] index = new int[array.length + 1];
        int max = 0;
        int check = 0;

        for (int i = 0; i < array.length; i++) {
            index[array[i]]++;
        }

        for (int i = 0; i < index.length; i++) {
            if (max < index[i]) {
                max = index[i];
                answer = i;
            }
        }

        for (int i = 0; i < index.length; i++) {
            if (max == index[i]) {
                check++;
            }
        }
        if (check > 1) {
            System.out.println(-1);
        }
        System.out.println(answer);
    }
}
