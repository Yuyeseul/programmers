class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd=0;
        int even=0;
        for(int i=1;i<=num_list.length;i++){
            if(i%2==1){
                odd +=num_list[i-1];
            }else{
                even+=num_list[i-1];
            }
        }
        if(odd>even){
            answer = odd;
        }else{
            answer =even;
        }
        return answer;
    }
}