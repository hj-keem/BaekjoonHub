class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        // strlist[i] ==> 한번씩 방문
        // strlist[i]의 문자열 길이를 확인할 수 있어야 함
        // strlist[i]의 문자열 길이를 확인 후 answer[i] 배열에 저장

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}