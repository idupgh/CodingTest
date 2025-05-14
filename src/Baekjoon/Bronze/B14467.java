package Baekjoon.Bronze;

import java.io.*;
import java.util.*;

public class B14467 {

    // 문제 맞춘 후 개선 가능한 부분
    // Arrays.fill(cow, -1) 로 하면 cowFound 변수 제거 가능

    public static void main(String[] args) throws IOException {
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 관찰 횟수
        int lookCnt = Integer.parseInt(br.readLine());

        // 소 무리
        int[] cow = new int[11];
        // 소를 찾았는지
        boolean[] cowFound = new boolean[11];

        for (int i = 0; i < lookCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cowNum = Integer.parseInt(st.nextToken());
            int cowMove = Integer.parseInt(st.nextToken());

            // 관찰된 소
            if (cowFound[cowNum]) {
                if (cow[cowNum] != cowMove) {
                    result++;
                    cow[cowNum] = cowMove;
                }
            } else {
            // 관찰 안된 소 -> 관찰로 이동
                cowFound[cowNum] = true;
                cow[cowNum] = cowMove;
            }
        }
        System.out.println(result);
    }
}
