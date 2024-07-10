import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수의 개수를 받는 부분
        int N = sc.nextInt();
        // 합을 구하는 횟수를 받는 부분
        int M = sc.nextInt();
        // 배열 선언, 크기는 N + 1 (문제에서 구간 합 계산 입력이 1이 최소이기 때문에)
        int[] A = new int[N+1];
        int[] S = new int[N+1];
        // N 개의 수만큼 값을 입력하는 부분
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            A[i] = num;
            // 합배열 바로 구하기 (S[i] = S[i-1] + A[i])
            S[i] = S[i-1] + A[i]; 
        }

        // 구간합 구하기(S[j]-S[i-1]). M만큼 반복
        for (int i = 0; i < M; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(S[w] - S[v-1]);
        }
    }
}