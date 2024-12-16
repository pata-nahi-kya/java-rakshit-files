

import java.util.Scanner;

public class rotate_array_1d {
    public static void reverse(int[] arr, int left, int right){
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        }
    
    
    static void print_array(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter length of array");
        //int length = scan.nextInt();
        int[] to_rotate = {1,2,3,4,5,6,7}; //new int[length];
        
        // System.out.println("enter elments of array");
        // for(int j = 0 ; j < length ; j++){
        //     to_rotate[j] = scan.nextInt();
        // }

        

        System.out.println("your array is ");
        print_array(to_rotate);

        System.out.println("type your number by which you want to rotate your array");
        int rotate =  4 ;//scan.nextInt();
        rotate = rotate %  7 ; //length;
        int[] rotated_array = new int[7];//length

        // way 2

        for(int k = 0 ; k<7 ; k++ ){
            int replace = k + rotate ;
            if(replace > 7 -1){
                replace = replace - 7 ;
            }
            rotated_array[k] = to_rotate[replace];
        }

        //print_array(rotated_array);

        //scan.close();
        
        // if(rotate > to_rotate.length)
        //     rotate=rotate%to_rotate.length;
        
        // for(int i=0; i < rotate; i++){
        //     rotated_array[i] = to_rotate[to_rotate.length-rotate+i];
        // }
        // int j=0;
        // for(int i=rotate; i<to_rotate.length; i++){
        //     rotated_array[i] = to_rotate[j];
        //     j++;
        // }
        // System.arraycopy( rotated_array, 0, to_rotate, 0, to_rotate.length );
        // print_array(rotated_array);


        // way 3
        // for(int i=0;i<rotate;i++) {
        //     for(int j=to_rotate.length-1;j>0;j--) {
        //         int temp =to_rotate[j];
        //         to_rotate[j]= to_rotate[j-1];
        //         to_rotate[j-1]=temp;
        //         // iss for loop mein bas last waale ko first le gaye hai
        //     }
        //     }

        // print_array(to_rotate);


        // way 4
        int a = to_rotate.length - rotate;
        reverse(to_rotate, 0, a-1);
        reverse(to_rotate, a, to_rotate.length-1);
        reverse(to_rotate, 0, to_rotate.length-1);
        print_array(to_rotate);
        scan.close();


    }    
}
