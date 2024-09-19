package maths;

import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("enter two number for hcf");
        int a = number.nextInt();
        int b = number.nextInt();

        for(int i = 2 ; i<a & i<b ; i++){
            if(a%i==0 & b%i== 0){
                System.out.println(i);
            }
        }
        number.close();

    }
}
