package baek.y24.m3.baek2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(bf.readLine());
        long B = Long.parseLong(bf.readLine());
        long C = Long.parseLong(bf.readLine());
        long count = A * B * C;
        String[] parsing = String.valueOf(count).split("");

        int[] digitCount = new int[10];
        for (String digit : parsing) {
            int num = Integer.parseInt(digit);
            digitCount[num]++;
        }

        for (int digit : digitCount) {
            System.out.println(digit);
        }
    }
}
