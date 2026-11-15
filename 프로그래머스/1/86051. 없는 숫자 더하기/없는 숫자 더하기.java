class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        boolean[] used = new boolean[10];
        
        for (int i = 0; i < numbers.length; i++) {
            used[numbers[i]] = true;
        }
        
        for (int j = 0; j < used.length; j++) {
            if (!used[j]) {
                answer += j;
            }
        }
        
        return answer + 1;
    }
}