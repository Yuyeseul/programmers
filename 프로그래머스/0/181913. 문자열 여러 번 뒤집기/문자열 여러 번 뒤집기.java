class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        int a = my_string.length();
        String[] my_str = my_string.split("");
        String[] str = new String[a];
        
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            for(int j = 0; j <= e-s; j++) {
                str[e-j] = my_str[s+j];
            }
            for(int j = 0; j <= e-s; j++) {
                my_str[s+j] = str[s+j];
            }
            
        }
        
        for(int i = 0; i < a; i++) {
            answer += my_str[i];
        }
        
        return answer;
    }
}