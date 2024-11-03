class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        int length = strlist.length;
        for(int i = 0; i<length; i++){
            answer[i] = strlist[i].length();
        }
        
        //map 활용 가능하다.
        return answer;
    }
}