package recursion;

public class k_multiples {
    static void  multiple_of_k(int n , int k){
        if(k==0){
            return ;
        }
        multiple_of_k(n, k-1) ;
        System.out.println(n*k);
       
    }

    public static void main(String[] args) {
        multiple_of_k(5, 3);        
    }
}
