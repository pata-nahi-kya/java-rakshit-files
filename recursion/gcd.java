package recursion;
// how to find highest common factor
public class gcd {
    static int find_gcd(int x , int y){ //long division problem
        if(y==0)return x;
        return find_gcd(y,x%y);}
    static int find_gcd2(int x , int y){
        while(x%y != 0){
            int rem = x%y;
            x = y;
            y = rem;}
        return y;}
    public static void main(String[] args) {
        System.out.println(find_gcd(35, 15));
    }}
