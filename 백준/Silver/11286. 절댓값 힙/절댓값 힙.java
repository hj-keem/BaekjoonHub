import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 선언 및 입력
        int N = Integer.parseInt(bf.readLine());

        // 우선순위 큐 선언
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {
            // 절댓값이 낮은 순위로 정렬
            // 절댓값이 낮은 경우를 우선순위로 두게 되어있는 comparator 사용
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            // 절댓값이 같을 경우 음수가 먼저 나갈 수 있도록 정렬 (내림차순)
            if (firstAbs == secondAbs){
                // o1이 o2보다 클 때 (양수일 때)는 양수를 반환하여 후순위로 두고
                // o1이 o2보다 작을 때 (음수일 때)는 음수를 반환하기 때문에 우선순위로 두기 위해 아래와같이 작성
                return o1 > o2 ? 1 : -1;
            }
            // 첫번쨰 값이 더 클경우 양수, 두번째 값이 더 클 경우 음수를 리턴하게 됨
            return firstAbs - secondAbs;
        });
        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(bf.readLine());
            if (request == 0) {
                if (myQueue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}