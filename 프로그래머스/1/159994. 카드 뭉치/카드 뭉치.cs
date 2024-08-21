using System;
using System.Collections.Generic;

public class Solution {
    public string solution(string[] cards1, string[] cards2, string[] goal) {
        string answer = "Yes";
        
        // Queue
        Queue<string> q1 = new Queue<string>();
        Queue<string> q2 = new Queue<string>();
        int goalLen = goal.Length;
        
        foreach (string card in cards1)
        {
            q1.Enqueue(card);
        }
        
        foreach (string card in cards2) 
        {
            q2.Enqueue(card);
        }
        
        for (int i = 0; i < goalLen; i++) {
            
            if (q1.Count != 0)
            {
                string el = q1.Peek();
                
                if (el == goal[i])
                {
                    q1.Dequeue();
                    continue;
                }
            }
            
            if (q2.Count != 0)
            {
                string el2 = q2.Peek();
                
                if (el2 == goal[i])
                {
                    q2.Dequeue();
                    continue;
                }
            }
            
            answer = "No";
            return answer;
        }        
        
        return answer;
    }
}