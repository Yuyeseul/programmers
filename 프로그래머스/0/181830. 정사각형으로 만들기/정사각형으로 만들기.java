class Solution {
    public int[][] solution(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        
        if(n>m){
            int[][] answer = new int[n][n];
            for(int i =0;i<n;i++){
                for(int j = 0;j<m;j++){
                    answer[i][j] = arr[i][j];
                }
                answer[i][m]=0;
            }
            return answer;
        }else if (n<m){
            int[][] answer = new int[m][m];
            for(int i =0;i<n;i++){
                for(int j = 0;j<m;j++){
                    answer[i][j] = arr[i][j];
                }
                answer[n][i]=0;
            }
            return answer;
        }else{
            return arr;
        }
              
    }
}