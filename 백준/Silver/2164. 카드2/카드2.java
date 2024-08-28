import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 선언 및 입력
        int N = Integer.parseInt(bf.readLine());

        // 큐 생성 및 값 채우기
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while( myQueue.size() > 1 ){
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());
    }
}