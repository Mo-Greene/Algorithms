package baek.y24.m3.baek8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        for (int i = 0; i < line; i++) {
            int result = sumOX(br);
            System.out.println(result);
        }
        br.close();
    }

    private static int sumOX(BufferedReader br) throws IOException {

        String[] readLine = br.readLine().split("");
        Queue<String> line = new ArrayDeque<>(Arrays.asList(readLine));

        int count = 0;
        int sum = 0;
        while (!line.isEmpty()) {
            if (line.poll().equals("O")) {
                count++;
            } else {
                count = 0;
            }
            sum += count;
        }

        return sum;
    }
}
