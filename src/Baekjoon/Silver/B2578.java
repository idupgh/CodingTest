package Baekjoon.Silver;

import java.io.*;
import java.util.*;

public class B2578 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] chulBingNum = new int[5][5];
        boolean[][] chulBingCheck = new boolean[5][5];
        int res = 0;

        // 철수 빙고판 숫자 입력
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                chulBingNum[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 사회자 숫자 부르기
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int x = Integer.parseInt(st.nextToken());
                res++;

                // 숫자 위치 찾고 체크
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (chulBingNum[k][l] == x) {
                            chulBingCheck[k][l] = true;
                        }
                    }
                }

                // 매 숫자 체크 이후, 빙고 개수 세기
                if (countBingo(chulBingCheck) >= 3) {
                    System.out.println(res);
                    return;
                }
            }
        }
    }

    private static int countBingo(boolean[][] arr) {
        int count = 0;

        // 가로
        for (int i = 0; i < 5; i++) {
            boolean bingo = true;
            for (int j = 0; j < 5; j++) {
                if (!arr[i][j]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) count++;
        }

        // 세로
        for (int j = 0; j < 5; j++) {
            boolean bingo = true;
            for (int i = 0; i < 5; i++) {
                if (!arr[i][j]) {
                    bingo = false;
                    break;
                }
            }
            if (bingo) count++;
        }

        // 대각선 1
        boolean bingo1 = true;
        for (int i = 0; i < 5; i++) {
            if (!arr[i][i]) {
                bingo1 = false;
                break;
            }
        }
        if (bingo1) count++;

        // 대각선 2
        boolean bingo2 = true;
        for (int i = 0; i < 5; i++) {
            if (!arr[i][4 - i]) {
                bingo2 = false;
                break;
            }
        }
        if (bingo2) count++;

        return count;
    }
}
