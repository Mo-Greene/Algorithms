package baek.y24.m3.baek2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine().trim());

        for (int i = 0; i < N; i++) {
            String line = bf.readLine();

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            String[] s = st.nextToken().split("");

            printOut(n, s);
        }

        bf.close();
    }

    private static void printOut(int n, String[] s) {
        StringBuilder sb = new StringBuilder();
        for (String string : s) {
            appendLetter(sb, n, string);
        }
        System.out.println(sb.toString());
    }

    private static void appendLetter(StringBuilder sb, int n, String s) {
        sb.append(String.valueOf(s).repeat(Math.max(0, n)));
    }
}
