import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> used = new HashSet<>();
        int index = 0;
        
        for (int num : arr) {
            if (!used.contains(num)) {
                answer[index++] = num;
                used.add(num);
            }
            
            if (index >= k) {
                break;
            }
        }
        
        return answer;
    }
}