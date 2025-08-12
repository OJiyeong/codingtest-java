import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int max = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            if(count.containsKey(strArr[i].length())) {
                count.put(strArr[i].length(), count.get(strArr[i].length())+1);
            } else {
                count.put(strArr[i].length(), 1);
            }
        }
        
        for (int value : count.values()) {
            if (value > max) max = value;
        }
        
        return max;
    }
}