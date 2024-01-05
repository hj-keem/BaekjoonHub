class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt=0;
        int intCnt=0;
    
        for(int i=0; i< numlist.length; i++){
            if(numlist[i] % n == 0)
                intCnt++;
        }
        
        int[] answer = new int[intCnt];        
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n==0){
                answer[cnt++] = numlist[i];
            }
        }
        return answer;
    }
}