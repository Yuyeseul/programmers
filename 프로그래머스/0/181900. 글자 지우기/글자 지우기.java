class Solution {
    public String solution(String my_string, int[] indices) {
        String[] answer = new String[my_string.length()];
        String result = "";
        for(int i=0;i<my_string.length();i++){
            answer[i] = String.valueOf(my_string.charAt(i));
            for(int j=0;j<indices.length;j++){
                if(i==indices[j]){
                    answer[i]="";
                }
            }
            result+=answer[i];
        }
        return result;
    }
}