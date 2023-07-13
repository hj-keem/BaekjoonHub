class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        // 0~9 까지의 전체 합은 45
        // numbers의 전체 합을 구해 45에서 뺀다.
        
        for(int i=0; i<numbers.length; i++){
            answer+= numbers[i];
        }
        
        
        return 44-answer;
    }
}