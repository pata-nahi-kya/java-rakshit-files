package maths;

import java.util.Scanner;

public class find_factorial {
    public static void main(String[] args) {
        // how to find factorial of number
        Scanner number = new Scanner(System.in);
        int factorial = number.nextInt();
        int helpFactorial = 1 ;

        for (int i = 1 ; i <= factorial ; i++){
            helpFactorial = helpFactorial*i ;            
        }
        System.out.println("factorial of number is " + helpFactorial);
        number.close();
    }
}
