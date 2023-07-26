import java.util.ArrayList;
import java.util.List;

/**
 * Matrix4
 */
public class Matrix4 {

    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0, endRow = matrix.length-1, startCol = 0, endCol = matrix[0].length-1;
        List<Integer> ans = new ArrayList<>();

        if(matrix.length == 1 || matrix[0].length == 1){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    ans.add(matrix[i][j]);
                }
            }
            return ans;
        }

        while(startRow <= endRow && startCol <= endCol){
            //top row
            for(int j = startCol; j<=endCol; j++){
                // System.out.print(matrix[startRow][j] + " ");
                ans.add(matrix[startRow][j]);
            }

            //right  col
            for(int i=startRow+1; i<=endRow; i++){
                // System.out.print(matrix[i][endCol]+ " ");
                ans.add(matrix[i][endCol]);
            }

            //bottom row
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                // System.out.print(matrix[endRow][j]+ " ");
                ans.add(matrix[endRow][j]);
            }

            //left col
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;
                }
                // System.out.print(matrix[i][startCol]+ " ");
                ans.add(matrix[i][startCol]);
            }

            startRow++; startCol++; endCol--; endRow--;
        }
        // System.out.println(matrix.length);
        return ans;
    }

    public static void main(String[] args) {
        //54. Spiral Matrix

    }
}