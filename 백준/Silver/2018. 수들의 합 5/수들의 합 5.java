import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // start_index와 end_index설정 등 변수 선언
        int startIndex = 1;
        int endIndex = 1;
        int count = 1;
        int sum = 1;

        while (endIndex != N){
            // sum이 N보다 작으면 end_index 오른쪽으로 이동(end_index++;) 그 값 더하기 sum+end_index
            // sum이 N보다 크면 sum - start_index 하고 start_index++;
            // sum과 N이 같으면 count++; 그리고 end_index++;
            if (sum < N) {
                endIndex++;
                sum = sum + endIndex;
            } else if (sum > N){
                sum = sum - startIndex;
                startIndex++;
            } else {
                count++;
                endIndex++;
                sum = sum+endIndex;
            }
        }
        System.out.println(count);
    }
}