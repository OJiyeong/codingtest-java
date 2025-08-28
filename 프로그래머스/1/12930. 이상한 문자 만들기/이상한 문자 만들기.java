class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length(); j++){
                char c = arr[i].charAt(j);
                if(c == ' ') sb.append(" ");
                else {
                    if(j%2 == 0) sb.append(Character.toUpperCase(c));
                    else sb.append(Character.toLowerCase(c));
                }
            }
            sb.append(" ");
        }
        String answer = sb.toString().substring(0, sb.length()-1);
        
        return answer;
    }
}