import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer;
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            if(! arr[i].equals("")) list.add(arr[i]);  
        }
        
        answer = new String[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}