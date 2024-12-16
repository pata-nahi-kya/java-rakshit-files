public class twoDimensions_array {

    public static void main(String[] args) {
        // An array keeps track of multiple pieces of information in linear order.
        // A one-dimensional list.

        // The data associated with certain programs (a digital image, a board game, etc.)
        // lives in two dimensions. To model this data, we need a multi-dimensional data
        // structure, that is, a multi-dimensional array.

        // A two-dimensional array is really nothing more than an array of arrays.

        // In the case of an array, our old-fashioned one-dimensional array looks like this:

        int[] oneDimension = {0,1,2,3};

        // And a two-dimensional array looks like this:

        int[][] twoDimensions = { {0,1,2,3}, {3,2,1,0}, {3,5,6,1}, {3,8,3,4} };

        // For our purposes, it is better to think of the two-dimensional array as a matrix.
        // A matrix can be thought of as a grid of numbers, arranged in rows and columns.
        // We might write the two-dimensional array out as follows to illustrate this point:
        int[][] matrix = {
            {0, 1, 2, 3},
            {3, 2, 1, 0},
            {3, 5, 6, 1},
            {3, 8, 3, 4}
        };

        // What does the following print?
        System.out.println(
            matrix[0][0]
        );
        System.out.println(
            matrix[2][3]
        );
        System.out.println(
            matrix[1][2]
        );

        System.out.println(
            twoDimensions[1][2]
        );

        // To walk through every element of a one-dimensional array,
        // we use a for loop, that is:
        for (int i = 0; i < oneDimension.length; i++) {
            oneDimension[i] = 0;
        }

        // For a two-dimensional array, in order to reference every
        // element, we must use two nested loops.
        // This requires that we have a counter variable for every column and
        // every row in the matrix.
        int cols = matrix.length;
        int rows = matrix[0].length;

        // Two nested loops allow us to visit every spot in a 2D array.
        // For every row 'i', visit every column 0 through 'j'.
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }

}

