class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        // Math.abs 절대값 씌우기
        
        if(a < b){
            for(int i=a; i<=b; i++){
                answer+=i;
            }
        }else if(a > b){
            for (int i = a; i >= b; i--)
                answer += i;
        }else{
            answer = a;
        }
        
        return answer;
    }
}