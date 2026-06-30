import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(wordDict); 
        
        
        solve(s, wordSet, "", ans); 
        return ans;
    }

    public void solve(String s, Set<String> wordSet, String temp, List<String> ans) {
        
        if (s.length() == 0) {
            ans.add(temp.trim());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            String leftPart = s.substring(0, i + 1);
            
         
            if (wordSet.contains(leftPart)) {
                String rightPart = s.substring(i + 1);
                solve(rightPart, wordSet, temp + leftPart + " ", ans);
            }
        }
    }
}