class Solution {
    boolean solution(String s) {        
        int pcnt = 0;
        int ycnt = 0;
        String[] arr = s.toLowerCase().split("");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("p")) pcnt++;
            else if(arr[i].equals("y")) ycnt++;
        }
        return pcnt == ycnt ? true : false;
    }
}