// how to print all subsequence of string using recursion

public class Hello {
   public static double myPow(double x, int n) {
        double answer = 1.00;
        
        if(n>0){
            for(int i = n ; i > 0 ; i--){
                answer = answer*x;}}
        else if(n<0){
            for(int i = n ; i<0 ; i++ ){
                answer = answer/x;}}
        
        return answer;
        
    }

public static void main(String[] args){
   System.out.println(myPow(2, 10));
   
   }
   


}

