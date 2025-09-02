class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(c != ' ') {
                if (c >= 'A' && c <= 'Z') {
                    char cn = (char)(c + n);
                    if(cn > 'Z') cn -= 26;
                    sb.setCharAt(i, cn);
                } else if (c >= 'a' && c <= 'z') {
                    char cn = (char)(c + n);
                    if(cn > 'z') cn -= 26;
                    sb.setCharAt(i, cn);
                }
            }
        }
        
        return sb.toString();
    }
}