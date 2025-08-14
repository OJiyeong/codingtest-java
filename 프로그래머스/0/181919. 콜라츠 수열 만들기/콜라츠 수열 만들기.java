import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        for(int i = n; n != 1; i--) {
            if(n % 2 == 0){
                list.add(n/2);
                n /= 2;
            } else {
                list.add(3*n+1);
                n = 3*n+1;
            }
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
        
        
    }
}