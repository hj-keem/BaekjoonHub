import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];

        // start_index와 end_index설정 등 변수 선언
        int startIndex = 1;
        int endIndex = arr.length-1;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int nNum = sc.nextInt();
            arr[i] = nNum;
        }
        Arrays.sort(arr);

        while (startIndex < endIndex) {
            if ( arr[startIndex] + arr[endIndex] < M ){
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] > M) {
                endIndex--;
            } else {
                count++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(count);
    }
}