
// first transpose and then reverse array row
public class rotate_matrix_2d {

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void transposeInPlace(int[][] matrix){

        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[i].length; j++){//we donot go all over matrix place
                // swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void rotate_row(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int k = 0 ; k < array[i].length ; k++){
                int left = 0 ;
                int right = array[i].length - 1;
                while(left<right){
                    int temp = array[i][right];
                    array[i][right] = array[i][left];
                    array[i][left] = temp;
                    left++;
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        transposeInPlace(array);
        rotate_row(array);    
        printMatrix(array);
    
    }
}
