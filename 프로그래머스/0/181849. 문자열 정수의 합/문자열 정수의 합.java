class Solution {
    public int solution(String num_str) {
        int num = 0;
        int answer = 0;
        
//         num = Integer.parseInt(num_str);
        
//         while(num > 0) {
//             answer += num % 10;
//             num /= 10;
//         }
//         return answer;
        
        for(int i = 0; i < num_str.length(); i++) {
            answer += num_str.charAt(i) - '0';
        }
        
        return answer;
    }
}