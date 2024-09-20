package maths;

import java.util.Scanner;

public class sum_even {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //sum of first n even terms
        int even = number.nextInt();
        int even_sum = 0 ;

        for(int i = 0 ; i<= even ; i++){
            if (i%2==0){
                even_sum = even_sum + i;
            }
        
        }
        number.close();
        System.out.println(even_sum);
    }
}
