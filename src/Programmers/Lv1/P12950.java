package Programmers.Lv1;

public class P12950 {
    public static void main(String[] args) {
        int arr1[][] = {{1},{2}};
        int arr2[][] = {{3},{4}};
        System.out.println(arr1.length);
        System.out.println(arr1[0].length);

        int[][] answer = solution(arr1, arr2);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i][i]);
        }
        // System.out.println(solution(arr1, arr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                int x = arr1[i][j];
                int y = arr2[i][j];

                answer[i][j] = x + y;
            }
        }

        return answer;
    }
}
