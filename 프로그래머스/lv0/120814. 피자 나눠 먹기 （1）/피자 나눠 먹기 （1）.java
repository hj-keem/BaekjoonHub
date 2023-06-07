class Solution {
    public int solution(int n) {
        int answer = 0;
        //n: 사람 수 //result : 피자 개수(한판에 7조각)
        //사람 <= 7 , 몫이 나눠진다면
        
        if(n%7 > 0){
            answer = (n/7)+1;
        }else if(n%7 == 0){ //맞아 떨어질 때
            answer= n/7 ;
        }
        return answer;
    }
}