package Baekjoon.Silver;

import java.io.*;
import java.util.StringTokenizer;

public class B14584 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String encStr = br.readLine();
        int cnt = Integer.parseInt(br.readLine());

        String[] strArr = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            strArr[i] = br.readLine();
        }

        for (int i = 0; i < 26; i++) {
            StringBuffer sb = new StringBuffer();

            for (char c : encStr.toCharArray()) {
                char decChar = (char) ((c - 'a' + i) % 26 + 'a');
                sb.append(decChar);
            }

            for(String dicStr : strArr) {
                if (sb.toString().contains(dicStr)) {
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}
