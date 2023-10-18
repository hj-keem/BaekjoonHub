import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // 이분탐색 로직
    public static int search(int[] nNum, int target){
        int high = nNum.length-1;
        int low = 0;
        
        while(low <= high) {
            int mid = ( high + low ) / 2;
            if(target > nNum[mid]){
                low = mid + 1;
            }
            else if(target < nNum[mid]){
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫째 줄에 자연수 N
        int n = sc.nextInt();
        int[] nNum = new int[n];
        for (int i = 0; i < n; i++) {
            nNum[i] = sc.nextInt();
        }
        Arrays.sort(nNum);

        // 둘째 줄에 자연수 M
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int mNum = sc.nextInt();
            // 여기서 mNum은 search() 에서 target이 된다.
            // 찾는 값이 있을 경우 1, 없을 경우 0을 출력한다.
            if(search(nNum,mNum) >= 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}