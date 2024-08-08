class Solution {
    public int[] solution(String[] park, String[] routes) {
        
        int roop = park.length;
        int sx = 0;
        int sy = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        for (int i = 0; i < roop; i++) {
            arr[i] = park[i].toCharArray();
            
            if (park[i].contains("S")) {
                sx = park[i].indexOf("S");
                sy = i;
            }
        }
        
        int colLen = arr.length;
        int rowLen = arr[0].length;
        
        
        for (String route : routes) {
            String way = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            
            int nx = sx;
            int ny = sy;
            
            for (int i = 0; i < distance; i++) {
                
                if (way.equals("E")) {
                    nx++;
                }
                
                if (way.equals("W")) {
                    nx--;
                }
                
                if (way.equals("S")) {
                    ny++;
                }
                
                if (way.equals("N")) {
                    ny--;
                }
                
                if (nx >= 0 && nx < rowLen && ny >= 0 && ny < colLen) {
                    if (arr[ny][nx] == 'X') {
                        break;
                    }
                    
                    if (i == distance - 1) {
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }
        
        int[] answer = {sy, sx};
        
        return answer;
    }
}