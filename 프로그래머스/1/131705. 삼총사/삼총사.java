class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int idx = number.length;
        
        for(int i = 0; i < idx; i++) {
            for(int j = i + 1; j < idx; j++) {
                for(int k = j + 1; k < idx; k++) {
                    int sum = number[i] + number[j] + number[k];
                    if(sum == 0) answer++;
                }
            }
        }
        
        return answer;
    }
}