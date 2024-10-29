import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length]; 

        if (direction.equals("left")){
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[answer.length - 1] = numbers[0];
        } else if (direction.equals("right")) {
            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            answer[0] = numbers[numbers.length-1];
        }
        return answer;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        System.out.println(Arrays.toString(sol.solution(numbers, direction)));
    }
}