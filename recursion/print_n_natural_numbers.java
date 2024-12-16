package recursion;

public class print_n_natural_numbers {
    static void printingNatural(int n){
        if(n <= 0){
            return;
        }
        printingNatural(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printingNatural(10);
    }
}
