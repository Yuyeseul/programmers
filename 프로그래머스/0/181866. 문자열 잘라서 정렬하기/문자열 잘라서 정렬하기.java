import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x",0);
        
        List<String> list = new ArrayList<>();
        for (String str : answer) {
            if (!str.isEmpty()) {
                list.add(str);
            }
        }
        
        String[] result = list.toArray(new String[0]);
        Arrays.sort(result);
        return result;
    }
}