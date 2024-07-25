import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer bf = new StringBuffer();

        Stack<Integer> stack = new Stack<>();
        int jayoensu = 1;
        boolean result = true;

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N; i++) {
            int now = A[i];

            if (now >= jayoensu){
                while (now >= jayoensu){
                    stack.push(jayoensu++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int check = stack.pop();
                // pop한 값이 현재 수열 보다 크면
                if (check > now) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());

    }
}