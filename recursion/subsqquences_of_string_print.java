package recursion;

public class subsqquences_of_string_print {
    static void SoSP(String s , String currChamp){
        if(s.length() == 0){
            System.out.println(currChamp);
            return;
        }
        SoSP(s.substring(1), currChamp + s.charAt(0));
        SoSP(s.substring(1) , currChamp);
    }

    public static void main(String[] args) {
        SoSP("abc", "");
    }
}

