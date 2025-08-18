import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int maxIndex = numbers.length-1;
        Arrays.sort(numbers);
        return numbers[maxIndex]*numbers[maxIndex-1];
    }
}