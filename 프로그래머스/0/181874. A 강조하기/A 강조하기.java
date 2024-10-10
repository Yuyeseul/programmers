class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0;i<myString.length();i++){
            String c = myString.charAt(i)+"";
            if(c.equals("a")||c.equals("A")){
                answer += c.toUpperCase();
            }else{
                answer += c.toLowerCase();
            }
        }
        return answer;
    }
}