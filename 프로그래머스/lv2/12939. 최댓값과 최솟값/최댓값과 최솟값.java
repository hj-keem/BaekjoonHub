class Solution {
    public String solution(String s) {
        String[] answer = new String[s.length()];
        int[] changeInt = new int[answer.length];
        String result ="";

        answer = s.split(" ");

        // 비교를 위해 정수로 변환
        for (int i = 0; i < answer.length; i++) {
            changeInt[i] = Integer.parseInt(answer[i]);
        }

        // 최댓값 최소값을 구하기 위한 값 지정
        int min = changeInt[0];
        int max = changeInt[0];

        // min, max 구하기
        for (int i = 0; i < answer.length; i++) {
            if(changeInt[i] < min){
                min = changeInt[i];
            }

            if(changeInt[i] > max){
                max = changeInt[i];
            }
        }

        result = min+" "+max;
        return result;
    }
}