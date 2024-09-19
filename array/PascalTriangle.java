



public class PascalTriangle {

    static void printMatrix(int[][] array){
        for(int i = 0 ; i < array.length ; i++){
            for(int k = 0 ; k < array[i].length; k++ ){
                System.out.print(array[i][k]);
            }
            System.out.println();
        }
    }
    

    static int[][] pascal(int n){
        int[][] pascal_array = new int[n][];
        for(int i = 0 ; i < n ; i++){
            pascal_array[i] = new int[i+1] ;//ith row have i+1 row 
            pascal_array[i][0] = pascal_array[i][i] = 1; // last and first are one

            for(int j = 1 ; j < i ; j++){
                pascal_array[i][j] = pascal_array[i-1][j-1] + pascal_array[i-1][j];
            }
        }
        return pascal_array;
    }

    public static void main(String[] args) {
        int [] [] pascal_triangle = pascal(4);
        printMatrix(pascal_triangle);

        
    }
}
