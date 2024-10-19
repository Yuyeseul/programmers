class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int a = 1; 
        int rowStart = 0; //행
        int rowEnd = n - 1;
        int colStart = 0; //열
        int colEnd = n - 1;
        
        while (a <= n * n) {
            for (int i = colStart; i <= colEnd; i++) {
                answer[rowStart][i] = a++;
            }
            rowStart++; 

            for (int i = rowStart; i <= rowEnd; i++) {
                answer[i][colEnd] = a++;
            }
            colEnd--; 

            for (int i = colEnd; i >= colStart; i--) {
                answer[rowEnd][i] = a++;
            }
            rowEnd--; 
            
            for (int i = rowEnd; i >= rowStart; i--) {
                answer[i][colStart] = a++;
            }
            colStart++; 
        }
        
        return answer;
    }
}