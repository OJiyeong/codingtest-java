import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i = 0; i < myString.length()-pat.length() + 1; i++) {
            String my = myString.substring(i);
            if(my.startsWith(pat)) {
                answer += 1;
            }
        }
        return answer;
    }
}