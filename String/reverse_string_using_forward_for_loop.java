package String;

public class reverse_string_using_forward_for_loop {
    public static void main(String[] args) {
        String s = "abcdef";
        String reversed_s = "";
        for(int i = 0 ; i < s.length() ; i++){
            reversed_s = s.charAt(i) + reversed_s;
        }
        System.out.println(reversed_s);
    }
}
