
// if you dont get it go and study spirial_print_matrix.java
public class generate_spiral {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
   
    // enter n for n*n to create spiral matrix 
    static int[][] spiral_generator(int array){
        int time_counter = 0 ;
        int top_row = 0 ; 
        int left_row = 0;
        int bottom_row =  array - 1 ;
        int right_row = array - 1;
        int total_print = array*array ;
        int[][] array_spiral = new int[array][array];

        while(time_counter < total_print){
            // printing top row 
            for(int i = left_row ; i <= right_row && time_counter < total_print  ; i++ ){
                array_spiral[top_row][i] = time_counter ; 
                time_counter++;
            }
            
            top_row++;


            // printing right row
            for(int i = top_row ; i <= bottom_row && time_counter < total_print  ; i++ ){
                array_spiral[i][right_row] = time_counter ;
                time_counter++;
            }
            right_row--;

            // printing bottom row 
            for(int i = right_row ; i >= left_row && time_counter < total_print  ; i-- ){
                array_spiral[bottom_row][i] = time_counter;
                time_counter++;
            }
            
            bottom_row--;

            // printing left row
            for(int i = bottom_row ; i >= top_row && time_counter < total_print  ; i-- ){
                array_spiral[i][left_row] = time_counter;
                time_counter++;
            }
            
            left_row++;
        }
        return array_spiral;
    }
    public static void main(String[] args) {
        int[][] array = spiral_generator(4);
        
        printMatrix(array);

    }
}
