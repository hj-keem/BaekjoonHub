class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum=0;
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
        }
        for(int i=0; i<num_list.length; i++){
            answer *= num_list[i];
        }
        if(answer < sum*sum){
            answer = 1;
        }else if(answer > sum*sum){
            answer = 0;
        }
        return answer;
    }
}