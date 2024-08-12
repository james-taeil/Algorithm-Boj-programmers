class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        
        // 구현
        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;
        
        int len = wallpaper.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    top = Math.min(i, top);
                    left = Math.min(j, left);
                    bottom = Math.max(i + 1, bottom);
                    right = Math.max(j + 1, right);
                }
            }
        }
        
        answer = new int[] {top, left, bottom, right};
        
        return answer;
    }
}