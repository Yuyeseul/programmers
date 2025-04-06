class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isNotPrime = new boolean[n + 1]; // 소수가 아닌 수를 true로 표시
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                answer++;
            }
        }
        return answer;
    }
}
