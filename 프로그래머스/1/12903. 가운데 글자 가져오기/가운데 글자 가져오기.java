class Solution {
    public String solution(String s) {
        String answer = "";
        int leng = s.length();
        answer += (leng%2==0) ? s.substring(leng/2-1, leng/2+1) : s.charAt((leng+1)/2-1);
        return answer;
    }
}