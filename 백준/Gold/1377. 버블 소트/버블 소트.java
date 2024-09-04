import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 선언 및 입력
        int N = Integer.parseInt(bf.readLine());
        mData[] A = new mData[N];

        // 배열에 입력받은 값을 저장
        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(bf.readLine()), i);
        }
        Arrays.sort(A);
        int max=0;
        for (int i = 0; i < N; i++) {
            if (max < A[i].index - i)
                max = A[i].index - i;
        }
        System.out.println(max+1);
    }
}
class mData implements Comparable<mData> {
    int value;
    int index;

    public mData (int value, int index){
        super();
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}