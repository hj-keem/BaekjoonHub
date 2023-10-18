import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수의 개수
        int n = sc.nextInt();
        // 담을 공간
        int[] array = new int[n];

        // 개수만큼 수 출력
        for (int i = 0; i < n; i++) {
            array[i] =  sc.nextInt();
        }

        // 배열에 넣은 값 정렬
        Arrays.sort(array);

        // 한줄씩 출력
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}