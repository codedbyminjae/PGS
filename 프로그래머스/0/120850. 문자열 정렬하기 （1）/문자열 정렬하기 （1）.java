import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int num = 0;
        
         for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                answer[num] = ch - '0';
                num++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}