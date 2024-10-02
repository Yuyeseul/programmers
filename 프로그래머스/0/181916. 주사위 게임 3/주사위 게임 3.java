import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] map = {a,b,c,d};
        Arrays.sort(map);
        
        if(map[0]==map[3]){
            answer = 1111*map[0];
        }else if(map[0]==map[2]||map[1]==map[3]){
            if(map[0]==map[2]){
                answer = (10*map[1]+map[3])*(10*map[1]+map[3]);
            }else{
                answer =  (10*map[1]+map[0])*(10*map[1]+map[0]);
            }
        }else if(map[0]==map[1]&&map[2]==map[3]){
            answer = (map[0]+map[2])*Math.abs(map[0]-map[2]);
        }else if((map[0]==map[1])&&(map[1]!=map[2])&&(map[2]!=map[3])){
            answer = map[2]*map[3];
            
        }else if((map[1]==map[2])&&(map[0]!=map[1])&&(map[2]!=map[3])){
            answer = map[0]*map[3];
            
        }else if((map[2]==map[3])&&(map[1]!=map[2])&&(map[0]!=map[1])){
            answer = map[0]*map[1];
            
        }else {
            answer=map[0];
        }
        return answer;
    }
}