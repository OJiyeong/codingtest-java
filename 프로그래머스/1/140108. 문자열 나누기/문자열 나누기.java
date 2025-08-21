import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        int cntf = 1;
        int cntn = 0;
        int index = 0;
        char f = s.charAt(0);
        
        for(int i = 1; i < s.length(); i++) {
            if(f == s.charAt(i)) cntf++;
            else cntn++;
            
            if(cntf == cntn) {
                list.add(s.substring(index,i+1));
                index = i+1;
                if (index < s.length()) {
                    f = s.charAt(index);
                    cntf = 0;
                    cntn = 0;
                }
            }
        }
        
        if (index < s.length()) {
            list.add(s.substring(index));
        }
        
        System.out.println(list);
        return list.size();
    }
}