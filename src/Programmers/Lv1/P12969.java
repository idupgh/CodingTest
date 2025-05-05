package Programmers.Lv1;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 최초 작성
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for (int i = 0; i < a; i++) {
            sb.append("*");
        }

        for (int i = 0; i < b; i++) {
            sb2.append(sb).append("\n");
        }
        // ------------------------------

        // 다른 사람 풀이
        StringBuffer sb3 = new StringBuffer();
        IntStream.range(0, a).forEach(i -> sb3.append("*"));
        IntStream.range(0, b).forEach(i -> System.out.println(sb3.toString()));
    }
}
