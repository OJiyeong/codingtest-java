import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        int[] answer = new int[arr.length-1];
        int[] sortArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArr);
        
        int min = sortArr[0];
        int index = 0;
        
        if(arr.length == 1) return new int[]{-1};
        
        for(int n : arr) {
            if(n != min) answer[index++] = n;
        }
        
        return answer;
    }
}