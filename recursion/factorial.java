package recursion;

public class factorial {
    static int printingFactorial(int n){
        if(n == 1 || n == 0 ){
            return 1 ;
        }
        return n*printingFactorial(n-1);
    }
    public static void main(String[] args) {
        // for(int i = 0; i <= 10; i++) {
        //     System.out.println(printingFactorial(i));
        // }
        System.out.println(printingFactorial(5));
    }
}
