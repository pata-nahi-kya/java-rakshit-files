package String;
import java.util.Scanner;
public class reverse_string_order {
    public static void main(String[] args) {
        /* project - 1 */
        // reverse string example 
        // input = my name is rakshit
        // output = rakshit is name my
        
        Scanner scan = new Scanner(System.in);
        String text_to_reverse = scan.nextLine();
        StringBuilder sb = new StringBuilder("");
    
        String reversed_string = "";
        
        for (int i = text_to_reverse.length() -1  ; i >= 0 ; i--){
            if(text_to_reverse.charAt(i) != ' '){
                sb = sb.append(text_to_reverse.charAt(i));
            }
            else{
                if( text_to_reverse.charAt(i) == ' '){
                    reversed_string = reversed_string + " " + sb.reverse() ;
                    sb.setLength(0); 
                }
            }  
        }
        reversed_string = reversed_string +" " +sb.reverse() ;
        sb = new StringBuilder(reversed_string);
        System.out.println(sb.delete(0, 1));            
        scan.close();
        
    }
    
}
