class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd="";
        String even="";
        for(int num:num_list){
            if(num%2==0){
                even += Integer.toString(num);
            }else{
                odd += Integer.toString(num);
            }
        }
        answer = Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
}