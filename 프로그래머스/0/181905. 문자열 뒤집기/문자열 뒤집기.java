class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String result = my_string.substring(s,e+1);
        String result2 = "";
        for(int i = result.length()-1;i>=0;i--){
            result2 += result.charAt(i);
            
        }
        answer = my_string.replace(result, result2);
        return answer;
    }
}