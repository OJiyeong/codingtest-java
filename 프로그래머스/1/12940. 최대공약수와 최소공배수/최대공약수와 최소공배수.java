class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int max = gcd(n, m);
        int lcm = (n * m) / max;
        
        return new int[] {max, lcm};
    }
    
    public int gcd(int n, int m) {
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
}