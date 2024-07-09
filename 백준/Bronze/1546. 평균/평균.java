import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0 ;
        double res = 0 ;
        // 점수 갯수 입력 (N)
        int N = sc.nextInt();
        // 갯수 만큼 배열 생성
        int[] array = new int[N];
        // N개 만큼의 점수 입력
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            // 받은 점수를 배열에 저장 ( 배열은 처음에 선언 )
            array[i] = num;
        }
        // 배열에서 처음 값을 max로 설정
        int max = array[0];
        // 입력 받은 점수 중 가장 큰 값 선출 후 M에 넣기
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            sum += array[i];
        }
        // 위 과정을 거친 후 모든 점수를 점수/M*100 하여 평균내기
        System.out.println((double) sum/max*100/N);
    }
}
