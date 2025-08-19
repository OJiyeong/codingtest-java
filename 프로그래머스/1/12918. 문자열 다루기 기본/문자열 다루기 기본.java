class Solution {
    public boolean solution(String s) {
        boolean answer;
        s = s.toLowerCase();
        System.out.println(s);
        char[] arr = s.toCharArray();
        if (s.length() == 6 || s.length() == 4) {
            answer = true;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 'a' && arr[i] <= 'z') answer = false;
            }
        } else answer = false;
        return answer;
    }
}