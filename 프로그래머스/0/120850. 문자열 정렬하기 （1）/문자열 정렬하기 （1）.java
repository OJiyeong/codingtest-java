import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 48 && c <= 57) {
                // int n = Integer.parseInt(String.valueOf(c));
                int n = c - '0';
                list.add(n);
            }
        }
        // list.sort();
        
        int answer[] = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
     
        return answer;
    }
}