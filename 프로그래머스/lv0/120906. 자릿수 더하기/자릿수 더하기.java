class Solution {
    public int solution(int n) {
        int n2 = n;
        String str=Integer.toString(n2);
        int result=0;

        for (int i = str.length()-1; i >= 0; i--) {
            int pow = (int)Math.pow(10,i);
            if(n>0) {
                result += n / pow;
                n %= Math.pow(10, i);
            }else if(n==0){
                break;
            }
        }
        return result;
    }
}