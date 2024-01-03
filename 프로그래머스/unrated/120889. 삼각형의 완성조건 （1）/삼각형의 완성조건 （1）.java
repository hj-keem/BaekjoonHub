// sides 배열 오름차순으로 정렬
// sides.length - 1번째를 가장 큰 값으로 지정
// 나머지 값들은 sum+= 을 이용하여 더해준다.
// 그렇다면 배열의 순서와 값의 크기 상관없이 문제를 풀 수 있다.
import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int sum = 0 ;
        Arrays.sort(sides);
        sum = sides[0] + sides[1];
        
        if(sum > sides[sides.length - 1]){
            return 1;
        }else{
            return 2;
        }
    }
}