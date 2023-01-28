package problem.baekjoon.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[n];
        for (int i = 1; i <= arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            if (arr[i] == findNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
