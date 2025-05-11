package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15649 {
    static int N, M;
    static int[] sequence;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sequence = new int[M];
        visited = new boolean[N + 1];

        dfs(0);
        System.out.print(sb);
    }

    // depth: 현재까지 고른 수의 개수
    private static void dfs(int depth) {
        if (depth == M) {
            // M개를 모두 골랐으면 출력용 StringBuilder에 추가
            for (int num : sequence) {
                sb.append(num).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 1부터 N까지 시도
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    //초기 호출
    //dfs(0) → depth=0
    //depth=0
    //for문에서 i=1 선택
    //visited[1]=true, sequence[0]=1
    //dfs(1) 호출
    //depth=1
    //for문에서 i=1은 건너뛰고, i=2 선택
    //visited[2]=true, sequence[1]=2
    //dfs(2) 호출
    //depth=2
    //for문에서 i=1,2는 건너뛰고, i=3 선택
    //visited[3]=true, sequence[2]=3
    //dfs(3) 호출
    //depth=3
    //for문에서 i=1,2,3은 모두 이미 사용(visited) 상태 → 건너뛰고
    //i=4 선택
    //visited[4]=true, sequence[3]=4
    //dfs(4) 호출
    //depth=4 (기저 조건 충족)
    //depth == M(4) 이므로 지금까지 채운 sequence = [1,2,3,4]를 출력
    //1 2 3 4
    //백트랙: 되돌아가면서 visited[4]=false
    //depth=3로 복귀
    //for문의 i=5는 없으므로 종료
    //백트랙: 되돌아가면서 visited[3]=false
    //depth=2로 복귀
    //for문에서 다음 i=4 선택 (이전에 i=3을 썼던 자리)
    //visited[4]=true, sequence[2]=4
    //dfs(3) 호출
    //depth=3 (다시)
    //사용된 숫자는 1,2,4 → for문에서 i=1,2,4 건너뛰고
    //i=3 선택
    //visited[3]=true, sequence[3]=3
    //dfs(4) 호출
    //depth=4 (다시 기저 조건)
    //sequence = [1,2,4,3] 출력
}
