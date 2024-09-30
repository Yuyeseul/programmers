import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<>();

    public int[] solution(int l, int r) {
        for (int i = 1; i <= 6; i++) { 
            dfs(l, r, i, "");
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(list);
            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    private void dfs(int l, int r, int length, String num) {
        if (length == num.length()) {
            int number = Integer.parseInt(num);
            if (number >= l && number <= r) {
                list.add(number);
            }
            return;
        }

        dfs(l,r,length,num+"5");
        if (!num.equals("")) {
            dfs(l,r,length,num+"0");
        }
    }
}