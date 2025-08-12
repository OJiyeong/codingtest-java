class Solution {
    public int solution(String A, String B) {
        int count = -1;
        StringBuilder sb1 = new StringBuilder(A);
        StringBuilder sb2 = new StringBuilder(A);
        int index = sb2.length();
        
        if(A.equals(B)) {
            count = 0;
        } else {
            for(int i = 0; i < index; i++) {
                sb1.setCharAt(0, sb2.charAt(index-1));
                for(int j = 1; j < sb2.length(); j++) {
                    sb1.setCharAt(j, sb2.charAt(j-1));
                }
                
                sb2.setLength(0);
                sb2.append(sb1);
                

                if(sb1.toString().equals(B)) {
                    count = i+1;
                    break;
                }
            }
            
        
        }
        return count;
    }
}