package AAAtodo;

public class ImageRotate {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},  //741
                          {4,5,6},   //852
                          {7,8,9}};  // 963
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length, start=0, end =0;;
        for(int i = 0; i<row; i++){
            for(int j = i; j<col; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}
