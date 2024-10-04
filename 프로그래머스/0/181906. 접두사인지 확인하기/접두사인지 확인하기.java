class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] a = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            a[i] = my_string.substring(0,i+1);
        }
        for(int j=0;j<a.length;j++){
            if(a[j].equals(is_prefix)){
                answer =1;
            }
        }
        return answer;
    }
}