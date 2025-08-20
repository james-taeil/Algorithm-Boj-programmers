import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. 두 리스트 sort
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        // 2. completion list length만큼 돌면서 participant 확인해서 없는 선수 찾기
        int len = completion.length;
        
        for (int i = 0; i < len; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        
        // 3. 전부 다 돌았는데 없을 경우 마지막 주자가 완주하지 못한 선수
             
        return participant[participant.length - 1];
    }
}