import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 선언 및 입력
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        // 배열에 입력받은 값을 저장
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }
        
        // swap 하며 오름차순으로 정렬
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}