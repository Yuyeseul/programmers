class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        
        for(int i = 0;i<k*picture.length;i++){
            String s = "";
            for(int j = 0;j<k*picture[0].length();j++){
                char c = picture[i/k].charAt(j/k);
                s += c;
            }
            answer[i] = s;
        }
        return answer;
    }
}