import java.util.Scanner;
import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        // 1. Scanner를 이용하여 5개의 숫자 받기
        // 2. 받자마자 배열에 넣기
        // 3. 해당 배열을 If문을 통해 작은 수를 첫번째 배열에 맞출 수 있도록 설정
        
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] numList = new int[inputNum];
        
        for (int i = 0; i < numList.length; i++) {
            int num = sc.nextInt();
            numList[i] = num;
        }
        sort(numList);

        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }
    }
}