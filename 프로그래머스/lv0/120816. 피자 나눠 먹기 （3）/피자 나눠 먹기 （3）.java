class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int pizza=1;
        
        while(true){
            if((slice*pizza)/n > 0){
                answer = pizza;
                break;
            }pizza++;
        }
        return answer;
    }
}