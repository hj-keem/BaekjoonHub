class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1.length];
        
        // arr1 의 2차원 배열 값 구하기
        // arr2 의 2차원 배열 값 구하기
        
        for(int i =0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){ //i만큼
                arr1[i][j]+=arr2[i][j];
            }
        }
        return arr1;
    }
}