class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long increase = x;
        for(int i = 0; i < n; i++){
            answer[i] = increase;
            increase += x;
        }
        return answer;
    }
}