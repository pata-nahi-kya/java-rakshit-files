package recursion;

public class sum_of_n_natural_number {
    static int  printingFibonacci(int n){
        
        if(n==1){
            return (n + n-1);
        }
        
        return (n + printingFibonacci(n-1)) ;
          
    }
    public static void main(String[] args) {
        System.out.println(printingFibonacci(9));
    }
}
