package codes;

public class palindrome_number {
    public static void main(String[] args) {
        int x = -2552 ;
        
        int reverse = 0 ;
        int remainder = 0 ;
        int x2 = x;
        if(x<0){
            System.out.println("not palindrome");
        }
        else{
            while(x2 != 0){
                remainder = x2 % 10 ;
                reverse = reverse*10 + remainder ;
                x2 = x2 / 10 ;
            }
            if(x == reverse){
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        }
        
    }
    
}
