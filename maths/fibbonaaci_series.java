package maths;

import java.util.Scanner;

public class fibbonaaci_series {
    public static void main(String[] args) {
        //fibbonaaci series 
        Scanner number = new Scanner(System.in);
        int fib_number = number.nextInt();
        int o = 0 ;
        for(int z = 0 ; z < fib_number; z++ ){
            o = o + z ;
            System.out.println(o);

        }
        number.close();
    }
}
