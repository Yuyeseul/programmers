class Solution {
    public String[] solution(String[] str_list) {
        int l = -1;
        int r = -1;
        for(int i = 0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                l = i;
                break;
            }else if(str_list[i].equals("r")){
                r = i;
                break;
            }
        }
        
        if(l != -1){
            String[] answer = new String[l];
            for(int i=0;i<l;i++){
                answer[i] = str_list[i];
            }
            return answer;
        }else if(r != -1){
            String[] answer = new String[str_list.length-r-1];
            for(int i=r+1;i<str_list.length;i++){
                answer[i-r-1] = str_list[i];
            }
            return answer;
        }
        return new String[0];
    }
}
