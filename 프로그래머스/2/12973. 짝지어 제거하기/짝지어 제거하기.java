import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayDeque<Character> ad = new ArrayDeque<>();
        char[] c = s.toCharArray();
        
        for(char cc : c) {
            if(!ad.isEmpty() && ad.peek() == cc) {
                ad.pop();
            } else ad.push(cc);
        }
        
        return (ad.size() == 0) ? 1 : 0;
    }
}