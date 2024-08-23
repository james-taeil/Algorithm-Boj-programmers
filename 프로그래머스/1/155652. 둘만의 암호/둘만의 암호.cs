using System;

public class Solution {
    public string solution(string s, string skip, int index) {
        string answer = "";
           
        int len = s.Length;
        char chr;
        int idx;
        
        for (int i = 0; i < len; i++) 
        {
            chr = s[i];
            idx = 0;
            
            while (idx != index)
            {
                chr = (char) ((int)chr + 1);
                
                if (chr > 'z')
                {
                    chr = 'a';
                }
                
                if (skip.Contains(chr))
                {
                    continue;
                }
                
                idx++;
            }
            
            answer += chr;
        }
        
        return answer;
    }
}