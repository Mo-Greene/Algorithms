package baek.y24.m3.baek2738;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> subjectStudent = new HashSet<>();
        for (int i = 1; i <= 30; i++) {
            subjectStudent.add(i);
        }
        for (int i = 0; i < 28; i++) {
            subjectStudent.remove(sc.nextInt());
        }

        for (int i : subjectStudent) {
            System.out.println(i);
        }
    }
}
