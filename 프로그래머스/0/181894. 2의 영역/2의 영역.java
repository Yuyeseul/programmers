import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int first = -1;
        int last = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==2){
                first = i;
                break;
            }
        }
        if (first == -1) {
            return new int[]{-1};
        }
        
        for(int j=first;j<arr.length;j++){
            if(arr[j]==2){
                last = j;
            }
        }
        if(first == last){
            result.add(2);
        }else{
            for(int i=first;i<=last;i++){
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i =0;i<result.size();i++){
            answer[i]=result.get(i);
        }
        
        return answer;
    }
}