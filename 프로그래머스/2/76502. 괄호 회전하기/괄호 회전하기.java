import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        
        for(int i = 0; i < len; i++) {
            boolean tf = true;
            char[] c = s.toCharArray();
            ArrayDeque<Character> ad = new ArrayDeque<>();
            
            for(char cc : c) {
                if(cc == '[' || cc == '{' || cc == '(') ad.push(cc);
                else {
                    if (ad.isEmpty()) {
                        tf = false;
                        break;
                    }
                    else {
                        char top = ad.pop();
                        if (
                            (cc == ']' && top != '[') || 
                            (cc == '}' && top != '{') || 
                            (cc == ')' && top != '(')
                        ) {
                            tf = false;
                            break;
                        }
                    }
                } 
            }
            if(tf && ad.isEmpty()) answer ++;
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}