class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String temp="";
        int p=0;
        int y=0;
        
        for(int i=0; i<s.length(); i++){
            temp = s.substring(i,i+1);
            if(temp.equals("p") || temp.equals("P")){
                p++;
            }else if(temp.equals("y") || temp.equals("Y")){
                y++;
            }
        }
 
        if(p != y){
            answer = false;
        }
        return answer;
    }
}