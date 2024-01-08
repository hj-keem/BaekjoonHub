// 가위:2 / 바위:0 / 보:5
class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i=0; i<rsp.length(); i++){
            String str = String.valueOf(rsp.charAt(i));
            if(str.equals("2")){
                answer+="0";
            }else if(str.equals("0")){
                answer+="5";
            }else{
                answer+="2";
            }
        }
        return answer;
    }
}