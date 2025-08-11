class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        // String result = myString.replace("A", "C");
        // result = result.replace("B", "A");
        // result = result.replace("C", "B");
        
        String result = myString.replace("A", "C").replace("B", "A").replace("C", "B");
        
        // if (result.contains(pat)) {
        //     return 1;
        // } else {
        //     return 0;
        // }
        
        return result.contains(pat)? 1 : 0;
    }
}