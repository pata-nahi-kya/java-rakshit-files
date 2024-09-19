package prep_byte;
/*https://blog.prepbytes.com/wp-content/uploads/2020/06/charcomb.png */

// how to print tree 
public class character_combine {
    static void characterCombine(String s , String a , String b , int number){
        if(number == 0){
            System.out.println(s);
            return ;
        }
        characterCombine(s + a, a, b, number - 1);
        characterCombine(s + b, a, b, number - 1);
    }

    
    public static void main(String[] args) {
        String s = "y";
        String a = "x";
        String b = "y";
        int number = 3 ;
        characterCombine(s, a, b, number);
    }
}
