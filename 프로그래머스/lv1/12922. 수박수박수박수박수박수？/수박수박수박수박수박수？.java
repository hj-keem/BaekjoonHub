class Solution {
    public String solution(int n) {
        String answer = "";
        
        // 1씩 증가 할 때마다 수,박 번갈아 더하기
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0) answer+="수";
            else if(i % 2 == 0) answer += "박";
        }
        return answer;
    }
}