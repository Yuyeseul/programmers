import java.util.*;
class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] a = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            a[i] = my_string.substring(i);
        }
        Arrays.sort(a);
        for(int j=0;j<my_string.length();j++){
            if(a[j].equals(is_suffix)){
                answer=1;
            }
        }
        return answer;
    }
}