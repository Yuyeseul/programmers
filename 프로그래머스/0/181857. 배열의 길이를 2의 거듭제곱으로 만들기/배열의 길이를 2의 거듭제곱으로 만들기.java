import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int l = 1;
        
        while (l < arr.length) {
            l *= 2;
        }
        
        int[] answer = new int[l];
        Arrays.fill(answer, 0);
        
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}