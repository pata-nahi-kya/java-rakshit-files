
public class spiral_print_matrix {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
   
   
    static void spiral_print(int[][] array){
        int time_counter = 0 ;
        int upper_row = 0 ; 
        int left_column = 0;
        int lower_row =  array.length - 1 ;
        int right_column = array[0].length - 1;
        int total_print = array.length * array[0].length ;

        while(time_counter < total_print){
            // printing top row 
            for(int i = left_column ; i <= right_column && time_counter < total_print  ; i++ ){
                System.out.print(array[upper_row][i] + " ");
                time_counter++;
            }

            upper_row++;


            // printing right row
            for(int i = upper_row ; i <= lower_row && time_counter < total_print  ; i++ ){
                System.out.print(array[i][right_column] + " ");
                time_counter++;
            }
            right_column--;

            // printing bottom row 
            for(int i = right_column ; i >= left_column && time_counter < total_print  ; i-- ){
                System.out.print(array[lower_row][i] + " ");
                time_counter++;
            }
            
            lower_row--;

            // printing left row
            for(int i = lower_row ; i >= upper_row && time_counter < total_print  ; i-- ){
                System.out.print(array[i][left_column] + " ");
                time_counter++;
            }
            
            left_column++;
        
        }
    }
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12} };
        
        spiral_print(array);
        printMatrix(array);
    }
}
