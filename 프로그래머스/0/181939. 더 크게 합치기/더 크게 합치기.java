class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int value1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int value2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));

        if(value1>value2){
            answer = value1;
        }else{
            answer = value2;
        }
        return answer;
    }
}