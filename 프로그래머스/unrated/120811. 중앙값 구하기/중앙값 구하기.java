import java.util.*;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int num = (array.length / 2) + 1;
        return array[num-1];
    }
}