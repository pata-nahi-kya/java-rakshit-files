

import java.util.Arrays;

public class sort_array {
    public static void main(String[] args) {
        int array [] = {1, 4 , 2 ,7 ,8 ,3};
        Arrays.sort(array);
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
        // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);


        
    }
    
}
