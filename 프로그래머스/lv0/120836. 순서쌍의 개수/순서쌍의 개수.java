class Solution {
    public int solution(int n) {
        int answer = 0;
        int b =0;
        // a * b == n 일 때, a가 주어지면 n/a == b로 b를 구할 수 있음
        for(int a=1; a<=n; a++){
            b = n/a;
            if(a*b == n)
                answer++;
        }
        
        return answer;
    }
}