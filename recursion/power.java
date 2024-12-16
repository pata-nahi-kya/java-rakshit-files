package recursion;

public class power {
    static int pow(int p , int q){
        if(q==1){
            return p;
        }
        return pow(p, q-1)*p ;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
