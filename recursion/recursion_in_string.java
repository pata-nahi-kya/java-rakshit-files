package recursion;

public class recursion_in_string {
    static boolean isPalindrome(String s, int l, int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1)) ;
    }

    static String removeA2(String s){
        if(s.length() == 0) return ""; // ye first hoga
        String smallAns = removeA2(s.substring(1)); // first letter compare ho raha hai idhar
        char currChar = s.charAt(0);
        if(currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }
    static String removeA(String s, int idx){ //idx is zero
        if(idx == s.length()) return "";
        String smallAns = removeA(s, idx+1); // idx badhatha hai aur letter a hoga to remove
        char currChar = s.charAt(idx); // first letter start from idx = s.length - 1
        if(currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String reverse(String s, int idx){
        if(idx == s.length()) return "";
        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);// this line start from s.length-1
        
    }

    public static void main(String[] args) {
        String s = "abcdef";
        reverse(s, 0);
    }
}