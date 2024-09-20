package maths;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random_number_generator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // random number generator

        //way one 
        Random random = new Random();
        int rand = random.nextInt(89);
        System.out.println(rand);
        
        //way two
        //math.random generates random decimal value between 0 and 1
        System.out.print("Random value between 0 - 9:\t");
        int randomInteger10 = (int) Math.floor(Math.random() * 10);
        System.out.println(randomInteger10);

        System.out.print("Random value between 1 - 10:\t");
        int randomInteger = (int) Math.floor(Math.random() * 10) + 1;
        System.out.println(randomInteger);

        System.out.print("Random value between 0 - 100:\t");
        int randomInteger100 = (int) Math.floor(Math.random() * 100);
        System.out.println(randomInteger100);

        // third way by thread local random current 
        int randomInteger2 = ThreadLocalRandom.current().nextInt();  
        double randomDouble = ThreadLocalRandom.current().nextDouble(); 
        boolean randomBoolean = ThreadLocalRandom.current().nextBoolean(); 
  
        System.out.println("random integer: " + randomInteger2); 
        System.out.println("random double: " + randomDouble);       
        System.out.println("random boolean: " + randomBoolean); 
        number.close();
    }
}
