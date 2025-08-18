class Solution {
    public int[] solution(int[] num_list) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i < num_list.length; i++){
            if (num_list[i] % 2 == 0) cnt2++;
            else cnt1++;
        }
        int[] answer = {cnt2, cnt1};
        
        /*
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
        */
        return answer;
    }
}