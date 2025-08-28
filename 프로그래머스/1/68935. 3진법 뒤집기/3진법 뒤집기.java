import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        int p = 0;
        
        while(n != 0) {
            list.add(n%3);
            n = n/3;
        }
        
        for(int i = list.size()-1; i >= 0; i--){
            answer += list.get(i)*Math.pow(3, p);
            p++;  
        }
        
        return answer;
    }
}