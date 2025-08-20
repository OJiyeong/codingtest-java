import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < t.length()-len+1; i++) {
            list.add(t.substring(i,i+len));
        }
        
        for(String i:list){
            if(i.compareTo(p) <= 0) answer++;
        }

        return answer;
    }
}