import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int checkArr[];
    static int myArr[];
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();

        // 선언부
        char[] sArr = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        cnt = 0;
        int result = 0;

        // 임의의 문자열 입력받기 (문자열 전체) // 문자열을 문자 배열로 변환
        String str = sc.next();
        sArr = str.toCharArray();

        // 조건 횟수 입력받기
        for (int i = 0; i < 4; i++) {
            checkArr[i] = sc.nextInt();
            if (checkArr[i] == 0) cnt++;
        }

        // ------------- 계산 시작 ------------ //

        // 각 알파벳 갯수 체크
        for (int i = 0; i < P; i++) {
            Add(sArr[i]);
        }
        if(cnt == 4) result++;

        // 슬라이딩
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(sArr[i]);
            Remove(sArr[j]);
            if (cnt == 4) result++;
        }
        System.out.println(result);
    }

    public static void Add(char c) {
        switch (c){
            case 'A' :
                myArr[0]++;
                if (myArr[0] == checkArr[0]) cnt++;
                break;
            case 'C' :
                myArr[1]++;
                if (myArr[1] == checkArr[1]) cnt++;
                break;
            case 'G' :
                myArr[2]++;
                if (myArr[2] == checkArr[2]) cnt++;
                break;
            case 'T' :
                myArr[3]++;
                if (myArr[3] == checkArr[3]) cnt++;
                break;
        }
    }

    public static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) cnt--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) cnt--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) cnt--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) cnt--;
                myArr[3]--;
                break;
        }
    }
}