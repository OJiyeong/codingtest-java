class Solution {
    public String solution(String my_string, int[] index_list) {
        
        String answer = "";
        int length = index_list.length;
        
        for(int i = 0; i < length; i++) {
            answer += my_string.charAt(index_list[i]);
        }
        
        return answer;
    }
}