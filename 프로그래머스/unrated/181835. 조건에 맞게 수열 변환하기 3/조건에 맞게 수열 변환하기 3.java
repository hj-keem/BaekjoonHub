class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        if(k % 2 != 0){
            for(int i=0; i<arr.length; i++){
                arr[i] = arr[i] * k; // arr의 모든 원소에 k를 곱하여 저장
            }
        }else if(k % 2 == 0){
            for(int i=0; i<arr.length; i++){
                arr[i] = arr[i] + k; // arr의 모든 원소에 k를 더하여 저장
            }
        }
        return arr;
    }
}