import java.util.*;
class Solution {
    public class Point {
        int s, d;

        public Point(int s, int d) {
            this.s = s;
            this.d = d;
        }
    }

    List<Point>[] reqList; //작업 배열
    int[][] requiredTime; //k유형에 n명의 멘토가 있을때 소요 시간
    int K, N;

    public int solution(int k, int n, int[][] reqs) {
        //초기화
        reqList = new List[k];
        for (int i = 0; i < k; i++) reqList[i] = new ArrayList<>();
        for (int i = 0; i < reqs.length; i++)
            reqList[reqs[i][2] - 1].add(new Point(reqs[i][0], reqs[i][1]));
        requiredTime = new int[k][n - k + 2];
        K = k; N = n;
        //유형별 멘토수에 따른 대기 시간 계산
        for (int i = 0; i < k; i++)
            for (int j = 1; j < n - k + 2; j++)
                requiredTime[i][j] = calTime(i, j);
        //각 유형별 멘토수 설정 후 대기시간의 최소시간 계산
        return calTotalMinTime();
    }

    public int calTotalMinTime() {
        int remain = N - K;
        int[] mentorCnt = new int[K];
        Arrays.fill(mentorCnt, 1);
        while(remain-- > 0) {
            int maxDiff = 0;
            int maxIndex = 0;
            for (int i = 0; i < K; i++) {
                if (mentorCnt[i] == N - K + 1) continue;
                int diff = requiredTime[i][mentorCnt[i]] - requiredTime[i][mentorCnt[i] + 1];
                if (maxDiff < diff) {
                    maxDiff = diff;
                    maxIndex = i;
                }
            }
            mentorCnt[maxIndex]++;
        }
        //결과 계산
        int sum = 0;
        for (int i = 0; i < K; i++)
            sum += requiredTime[i][mentorCnt[i]];
        return sum;
    }

    //k유형에 cnt명의 멘토가 있을떄 소요시간 계산
    public int calTime(int k, int cnt) {
        int result = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < cnt; i++) q.add(0);
        for (Point cust : reqList[k]) {
            Integer cur = q.poll();
            //해당 멘토의 종료시간 갱신 및 대기 시간 더해줌
            if (cur <= cust.s)
                q.add(cust.s + cust.d);
            else {
                result += cur - cust.s;
                q.add(cur + cust.d);
            }
        }
        return result;
    }
}