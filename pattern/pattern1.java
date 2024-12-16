import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) { 
        int i , j ;
        
        for (i = 0 ; i<6 ; i++){
            for(j=0 ; j <= i ; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for (i=1 ; i<6 ; i++){
            for(j=5 ;j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }



        System.out.println("input");
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        int k = 0 ;
        in.close();
        for( ; k <= st.length() ; k++ ){
            System.out.println(st.substring(0, k));
        } 

        // one sided christmas tree 
        for(int w = 0 ; w <= 5 ; w++){
            System.out.print("*");
            int t = 0;
            while(t <= k){
                System.out.print("|");
                t++ ;
            }
            System.out.println("*");
        }                   
        }    
    }  

