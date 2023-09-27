class Solution {
    public String solution(int age) {
        String answer = "";
        String reverse = "";
        // 나이 입력 시 한자리씩 읽기 (바로 아스키코드 변경)
        // age가 0보다 큰 숫자일 시 무한실행
        while(age>0){
            int rem = age % 10+97;
            // char 형태로 변경해 소문자가 나올 수 있도록 변환 및 문자열에 바로 저장
            answer += (char)rem;
            age /= 10;
        }
        // 거꾸로 읽기 때문에 뒤집어야 함
        for(int i=answer.length()-1; i >=0; i--)
            reverse += answer.charAt(i);
        return reverse;
    }
}