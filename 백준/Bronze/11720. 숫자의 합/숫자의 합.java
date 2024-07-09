import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
        // 방법1. String으로 받아 숫자로 변환
        // 방법2. 입력 받은 숫자를 10으로 나눠서(%) 나머지값 더하기
        // 보니까 입력값이 10을 넘으면 오류가 나고 있음 InputMismatchException
        // 위 오류는 int형보다 더 큰 값이 들어올 때 발생하는 것 같음.
        // 방법 2 선택 시 int는 10자리, Long은 19자리 이것보다 더 큰 수를 다룰 수 있는 자료형이 필요함.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n = sc.nextInt();
        String num = sc.next();
        for (int i = 0; i < n; i++) {
            String c = String.valueOf(num.charAt(i));
            sum += Integer.parseInt(c);
        }
        System.out.println(sum);
    }
}
