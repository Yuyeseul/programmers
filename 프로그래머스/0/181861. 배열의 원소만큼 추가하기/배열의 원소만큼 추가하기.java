import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i];j++){
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0;i<answer.size();i++){
            result[i]=answer.get(i);
        }
        
        return result;
    }
}