import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 선언 및 입력
        int N = Integer.parseInt(bf.readLine());
        int[] A = new int[N];
        int[] result = new int[N];
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        // 스택 생성
        Stack<Integer> myStack = new Stack<>();
        // 처음에는 무조건 스택이 비어있기 때문에 첫번째 인덱스 push
        myStack.push(0);

        for (int i = 1; i < N; i++) {
            // 스택이 비어있지 않고, 스택의 top 값이 현재 수열의 값보다 클때까지
            while( !myStack.empty() && A[myStack.peek()] < A[i] ){
                result[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        // 만약 오큰수를 구하지 못하고 for문을 빠져나왔다면
        while( !myStack.empty() ){ // 스택이 빌 때까지 반복해서
            // 스택에 남아있는 index에 -1을 넣는다.
            result[myStack.pop()] = -1;
        }

        // 그리고 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(result[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}