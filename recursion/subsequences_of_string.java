package recursion;

import java.util.ArrayList;

public class subsequences_of_string {
    static ArrayList<String> sub_sequence(String s ){
        ArrayList<String> subsequence = new ArrayList<>();

        if(s.length() == 0){
            subsequence.add("");
            return subsequence ;
        }
        

        ArrayList<String> SmallSubSequence2 =  sub_sequence(s.substring(1));
        
        for(String k : SmallSubSequence2){
            k = s.charAt(0) + k ;
            subsequence.add(k);
        }

        subsequence.addAll(SmallSubSequence2);
        return subsequence;
    }
    
    
    public static void main(String[] args) {
        ArrayList<String> ans = sub_sequence("abc");
        System.out.println(ans);
    }}
