package codes;
//1662. Check If Two String Arrays are Equivalent
public class check_if_two_string_are_equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < word1.length; i++) {
            s1 = s1 + word1[i] ;
        }
        for (int i = 0; i < word2.length; i++) {
            s2 = s2 + word2[i] ;
        }
        return (s1.equals(s2));
    }

    // use string builder instead of string and this is better solution
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder a=new StringBuilder();
         StringBuilder b=new StringBuilder();
           for(int i=0;i<word1.length;i++)
           a.append(word1[i]);
             for(int i=0;i<word2.length;i++)
           b.append(word2[i]);
           
                   return (a.toString()).equals(b.toString());
       }

}
