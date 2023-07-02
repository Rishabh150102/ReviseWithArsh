import java.util.ArrayList;

/**
 * Arrays1
 */
public class Arrays1 {

    public void setZeroes(int[][] matrix) {
        //ArrayList for adding rows and column indexes.
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        //Storing values of row and columns of zeros
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    // set(matrix, i, j); // passing row, column
                    r.add(i); c.add(j);
                }
            }
        }

        //setting the zeros
        for(int i=0;i<r.size();i++){
            int row = r.get(i);
            int col = c.get(i);
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j] = 0;
            }
            for(int j=0;j<matrix.length;j++){
                matrix[j][col] = 0;
            }
        }
    }

    public static void main(String[] args) {
        //Question 73 - Leetcode - Set Matrix Zeros
    }
}