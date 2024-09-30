import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<>();
        while(n != 1) {
            arrList.add(n);
            if (n % 2 == 0) {    
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        arrList.add(n);
        answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}