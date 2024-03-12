package baek.y24.m3.baek10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.contains("push")) {
                int pushNumber = Integer.parseInt(line.substring(5));
                integerStack.push(pushNumber);
            } else if (line.contains("pop")) {
                if (integerStack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(integerStack.pop());
                }
            } else if (line.contains("size")) {
                System.out.println(integerStack.size());
            } else if (line.contains("empty")) {
                if (integerStack.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (line.contains("top")) {
                if (integerStack.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(integerStack.peek());
                }
            }
        }
    }
}
