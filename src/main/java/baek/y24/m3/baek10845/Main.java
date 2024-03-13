package baek.y24.m3.baek10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> queue = new ArrayDeque<>();
        long N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            if (line.contains("push")) {
                push(queue, line);
            } else if (line.contains("pop")) {
                queuePop(queue.poll());
            } else if (line.contains("size")) {
                size(queue);
            } else if (line.contains("empty")) {
                empty(queue);
            } else if (line.contains("front")) {
                queuePop(queue.getFirst());
            } else if (line.contains("back")) {
                back(queue);
            }
        }
    }

    private static void back(Deque<Integer> queue) {
        Integer num = queue.peekLast();
        if (num == null) {
            System.out.println("-1");
        } else {
            System.out.println(num);
        }
    }

    private static void empty(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static void size(Queue<Integer> queue) {
        System.out.println(queue.size());
    }

    private static void queuePop(Integer queue) {
        if (queue == null) {
            System.out.println("-1");
        } else {
            System.out.println(queue);
        }
    }

    private static void push(Queue<Integer> queue, String line) {
        queue.add(Integer.valueOf(line.substring(5)));
    }
}
