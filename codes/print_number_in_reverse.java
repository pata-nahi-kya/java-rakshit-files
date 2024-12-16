package codes;

public class print_number_in_reverse {
    public static void main(String[] args) {
        int i = 123456;
        int reverse = 0;
        while(i != 0){
            reverse = reverse*10 ;
            reverse = reverse + i%10;
            i = i/10;
        }
        System.out.println("reversed number is " + reverse );
    }
}
