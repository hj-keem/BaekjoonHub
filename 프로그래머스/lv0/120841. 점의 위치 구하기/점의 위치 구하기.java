class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0 && dot[1] > 0){ answer = 1; } // 1사 분면
        else if(dot[0] < 0 && dot[1] > 0) { answer = 2; } //2사 분면
        else if(dot[0] < 0 && dot[1] < 0) { answer = 3; } //3사 분면
        else if(dot[0] > 0 && dot[1] < 0) { answer = 4; } //4사 분면
        return answer;
    }
}