class Solution {
    public int solution(String my_string) {
        String[] num = {"1","2","3","4","5","6","7","8","9","0"};
        int answer = 0;
        String temp = "";
        
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<num.length; j++){
                temp = String.valueOf(my_string.charAt(i));
                if(temp.equals(num[j])){
                    answer += Integer.parseInt(num[j]);
                }
            }
        }
        
        return answer;
    }
}