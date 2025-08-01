/* Q.73 ==> https://leetcode.com/problems/set-matrix-zeroes */


import java.util.HashSet;

public class setMatrix0 {
    static void setZeroes(int[][] matrix) {
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int r : row){
            for(int j=0;j<colLength;j++){
                matrix[r][j] = 0;
            }
        }

        for(int c : col){
            for(int j=0;j<rowLength;j++){
                matrix[j][c] = 0;
            }
        }
    }
}
