package String;

import java.util.Scanner;

public class longest_common_prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = "geeksforgeeks";
        String string2 = "geeksfor";
        String string3 = "geeksgeeksfor";
        String temp_prefix = "";
        String longest_prefix = "a";
        
        

        for(int i = 0 ; i < string1.length() ; i++){
            
            for(int j = i+ 1 ; j <= string1.length() ; j++){
                if(string2.contains(string1.substring(i, j)) && string3.contains(string1.substring(i, j))){
                    temp_prefix = string1.substring(i, j);
                    
                }
                if(longest_prefix.length() < temp_prefix.length()){
                    longest_prefix = temp_prefix ;
                }

            }
        }
        System.out.println(longest_prefix);
        scan.close();
    }    
}
