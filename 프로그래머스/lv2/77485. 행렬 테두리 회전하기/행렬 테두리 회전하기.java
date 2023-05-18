class Solution {
    static int[][] matrix;
    static int minNum;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        matrix = initMatrix(rows, columns);
        int queryIdx = 0;

        for (int[] query : queries) {
            rotation(query[0] - 1, query[1] - 1, query[2] - 1, query[3] - 1);
            answer[queryIdx] = minNum;
            queryIdx++;
        }

        return answer;
    }
    
    public int[][] initMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int num = 1;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = num++;
            }
        }
        return matrix;
    }
    
    static void rotation(int x1, int y1, int x2, int y2) {
        int saveNum = matrix[x1][y1];
        minNum = saveNum;

        // 왼쪽 : 위로 올리기
        for (int i = x1 + 1; i <= x2; i++) {
            matrix[i - 1][y1] = matrix[i][y1];
            minNum = Math.min(matrix[i][y1], minNum);
        }

        // 아래 : 왼쪽으로 이동
        for(int i = y1 + 1; i <= y2; i++) {
            matrix[x2][i - 1] = matrix[x2][i];
            minNum = Math.min(matrix[x2][i], minNum);
        }

        // 오른쪽 : 아래로 이동
        for (int i = x2 - 1; i >= x1; i--) {
            matrix[i + 1][y2] = matrix[i][y2];
            minNum = Math.min(matrix[i][y2], minNum);
        }

        // 위쪽 : 오른쪽으로 이동
        for (int i = y2 - 1; i >= y1; i--) {
            matrix[x1][i + 1] = matrix[x1][i];
            minNum = Math.min(matrix[x1][i], minNum);
        }

        matrix[x1][y1 + 1] = saveNum;
    }
    
//     public int[] solution(int rows, int columns, int[][] queries) {
//         int[] answer = new int[queries.length];
//         int[][] matrix = initMatrix(rows, columns);
//         int queryIdx = 0;

//         for (int[] query : queries) {
//             int x1 = query[0] - 1;
//             int y1 = query[1] - 1;
//             int x2 = query[2] - 1;
//             int y2 = query[3] - 1;
//             int saveNum = matrix[x1][y1];
//             int minNum = saveNum;


//             // 왼쪽 : 위로 올리기
//             for (int i = x1 + 1; i <= x2; i++) {
//                 matrix[i - 1][y1] = matrix[i][y1];
//                 minNum = Math.min(matrix[i][y1], minNum);
//             }

//             // 아래 : 왼쪽으로 이동
//             for(int i = y1 + 1; i <= y2; i++) {
//                 matrix[x2][i - 1] = matrix[x2][i];
//                 minNum = Math.min(matrix[x2][i], minNum);
//             }

//             // 오른쪽 : 아래로 이동
//             for (int i = x2 - 1; i >= x1; i--) {
//                 matrix[i + 1][y2] = matrix[i][y2];
//                 minNum = Math.min(matrix[i][y2], minNum);
//             }

//             // 위쪽 : 오른쪽으로 이동
//             for (int i = y2 - 1; i >= y1; i--) {
//                 matrix[x1][i + 1] = matrix[x1][i];
//                 minNum = Math.min(matrix[x1][i], minNum);
//             }

//             matrix[x1][y1 + 1] = saveNum;
//             answer[queryIdx] = minNum;
//             queryIdx++;
//         }
    
        
//         return answer;
//     }
    
}