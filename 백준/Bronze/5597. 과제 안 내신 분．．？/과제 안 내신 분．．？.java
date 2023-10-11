import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] num = new int[30];
        int[] temp = new int[2];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);

        // 과제를 제출한 28명의 번호 입력
        for (int i = 0; i < 28; i++) {
            cnt = sc.nextInt();
            num[cnt-1] = 1;
        }

        // 과제 안 낸 학생 뽑기
        for (int i = 0; i < 30; i++) {
            if(num[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}