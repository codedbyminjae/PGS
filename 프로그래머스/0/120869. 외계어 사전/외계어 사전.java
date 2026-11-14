class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        
        int sc = spell.length;
        int dc = dic.length;
        
        for (int i = 0; i < dic.length; i++) {
            count = 0;
            boolean[] used = new boolean[sc];
            
            for (int j = 0; j < dic[i].length(); j++) {
                char ch = dic[i].charAt(j);
                
                for (int k = 0; k < spell.length; k++) {
                    if (ch == spell[k].charAt(0) && !used[k]) {
                        count++;
                        used[k] = true;
                    }
                }
            }
            if (count == sc) {
                return 1;
            }
        }
        return answer;
    }
}