using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(string[] keymap, string[] targets) {
        
        Dictionary<char, int> map = new Dictionary<char, int>();
        int tarLen = targets.Length;
        int mapLen = keymap.Length;
        int[] answer = new int[tarLen];
        
        for (int i = 0; i < mapLen; i++) 
        {
            for (int j = 0; j < keymap[i].Length; j++)
            {
                char curr = keymap[i][j];
                
                if (map.ContainsKey(curr))
                {
                    int idx = map[curr];
                    map[curr] = Math.Min(j + 1, idx);
                }
                else 
                {
                    map[curr] = j + 1;
                }
            }
        }
        
        for (int i = 0; i < tarLen; i++) 
        {
            string target = targets[i];
            int count = 0;
            
            foreach(char cur in target)
            {
                if (map.ContainsKey(cur))
                {
                    count += map[cur];
                }
                else 
                {
                    count = -1;
                    break;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}