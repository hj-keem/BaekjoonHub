import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int k = 0; k < N; k++) {
            int K = arr[k];
            int i = 0;
            int j = arr.length-1;
            // 투포인터 알고리즘
            while (i < j) {
                if (arr[i] + arr[j] == K ){
                    if (k != i && k != j){
                        count++;
                        break;
                    } else if (i==k){
                        i++;
                    } else if (j == k){
                        j--;
                    }
                } else if (arr[i] + arr[j] < K ) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(count);
    }
}