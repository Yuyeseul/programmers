class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++){
            int low = queries[i][0], high = queries[i][1], num = queries[i][2];

            for (int j = 0; j < arr.length; j++){
                if (j >= low && j <= high){
                    if (j % num == 0){
                        arr[j]++;
                    }
                }
            }
        }
        return arr;
    }
}