class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int value = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int value2 = 2*a*b;
        if(value>value2){
            answer=value;
        }else{
            answer=value2;
        }
        return answer;
    }
}