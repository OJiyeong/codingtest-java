import java.util.*;

class Solution {
    public long solution(long n) {
        String[] num = String.valueOf(n).split("");
        Arrays.sort(num, Collections.reverseOrder());
        String sortnum = String.join("",num);
        return Long.parseLong(sortnum);
    }
}