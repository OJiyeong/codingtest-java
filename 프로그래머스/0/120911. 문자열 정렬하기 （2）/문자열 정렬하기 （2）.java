import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] arr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
        }
        
        Arrays.sort(arr);
        
        return new String(arr);
        
        /*
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
        */
    }
}