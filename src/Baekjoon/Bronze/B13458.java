package Baekjoon.Bronze;

import java.util.Scanner;

public class B13458 {
    public static void main(String[] args) {
        // N 개의 시험장
        // i 번 시험장에 있는 응시자 수 Ai
        // 감독 -> 총감독, 부감독
        // 총감독 감시 B, 부감독 감시 C

        long res = 0; //

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // n 개의 시험장
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 각 시험장 학생 수
        }

        int b = sc.nextInt(); // 총감독 감시
        int c = sc.nextInt(); // 부감독 감시

        for (int i = 0; i < n; i++) {
            int totalStudent = arr[i]; // 해당 시험장의 학생 수
            res++; // 시험장 마다 총감독 + 1
            int cStudent = totalStudent - b;
            if (cStudent > 0) {// 부감독 필요?
                res += (long) Math.ceil((double) cStudent / c);
            }
        }

        System.out.println(res);
    }
}
