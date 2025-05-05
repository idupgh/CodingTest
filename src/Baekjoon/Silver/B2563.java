package Baekjoon.Silver;

import java.util.Scanner;

public class B2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 색종이 수
        int colorPaperCnt = sc.nextInt();
        int rse = 0; // 총 합

        // 이미 먹힌 색종이 영역 표시
        boolean arr[][] = new boolean[101][101];

        for (int i = 0; i < colorPaperCnt; i++) {
            int x = sc.nextInt(); // 가로
            int y = sc.nextInt(); // 세로

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (!arr[x+j][y+k]) {
                        arr[x+j][y+k] = true;
                        rse++;
                    }
                }
            }
        }

        System.out.println(rse);
    }
}
