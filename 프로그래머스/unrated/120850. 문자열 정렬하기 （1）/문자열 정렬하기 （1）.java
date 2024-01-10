import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        int cntArray=0;
        int cnt=0;

        for (int i = 0; i < my_string.length(); i++) {
            if( my_string.charAt(i) < 65){
                cntArray++;
            }
        }
        System.out.println("cntArray = "+cntArray);
        int[] answer = new int[cntArray];

        for (int i = 0; i < my_string.length(); i++) {
            String ch = String.valueOf(my_string.charAt(i));
            for (int j = 0; j < numbers.length; j++) {
                if(ch.equals(numbers[j])){
                    answer[cnt++] = Integer.parseInt(numbers[j]);
                }
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}