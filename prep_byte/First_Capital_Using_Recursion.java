package prep_byte;


// return number of letter which is capital
public class First_Capital_Using_Recursion {
    static void First_occurence(String s , int idx ){
        if(idx == s.length() - 1  ){
            return;
        }
        if( Character.isUpperCase((s.charAt(idx)))  ){
            System.out.println(idx);
            return;
        }
        First_occurence(s, idx + 1);
    }

    public static void main(String[] args) {
        First_occurence("rakshitChandgadhiya", 0);
    }
}
