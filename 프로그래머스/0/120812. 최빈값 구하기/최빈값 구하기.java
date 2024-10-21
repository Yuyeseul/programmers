import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int a = array[array.length-1];
        int[] count = new int[a+1];
        for(int i = 0;i<array.length;i++){
            count[array[i]]++;
        }
        int max = count[0];
         boolean duplicate = false;

        for (int i = 1; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                answer = i;
                duplicate = false;
            } else if (count[i] == max) {
                duplicate = true; 
            }
        }

        if (duplicate) {
            answer = -1;
        }
        return answer;
    }
}