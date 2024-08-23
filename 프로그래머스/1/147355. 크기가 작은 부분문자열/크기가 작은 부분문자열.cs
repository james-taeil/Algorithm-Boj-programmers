using System;

public class Solution {
    public int solution(string t, string p) {
        int answer = 0;
        
        int len = p.Length;
        int roop = t.Length - len + 1;
        long num;
        
        for (int i = 0; i < roop; i++)
        {
            num = long.Parse(t.Substring(i, len));
            
            if (num <= long.Parse(p))
            {
                answer++;
            }
        }
        
        return answer;
    }
}