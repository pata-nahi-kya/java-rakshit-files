package recursion;

public class fibonacci {
    static int printingFibonacci(int n){
        if(n == 1 || n == 0 ){
            return 1;
        }
        return printingFibonacci(n-1)+ printingFibonacci(n-2) ; 
    }
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(printingFibonacci(i));
        }
        
    }
}
