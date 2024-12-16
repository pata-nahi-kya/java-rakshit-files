import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {

        // how to make pattern and match it with other string 
        String RegularExpression = "^[aA-zZ]\\w{7,29}$" ;
        Pattern pattern = Pattern.compile(RegularExpression);
        String s = "qwertyuiop";
        Matcher matches = pattern.matcher(s);
        System.out.println("do pattern ^[aA-zZ]\\w{7,29}$ matches with "+ matches.matches());

        // use of * is that anything behind it can be any number of time
        String RegularExpression2 = "a*b";
        Pattern pattern2 = Pattern.compile(RegularExpression2);
        String s2 = "aaaaaaaaaaab";
        Matcher matches2 = pattern2.matcher(s2);
        System.out.println("do pattern matches with a*b " + matches2.matches());

        // how to make checker of gmail address
        String RegularExpression3 = "^[a-zA-Z0-9_]\\w{4,50}@gmail.com{1}$";
        Pattern pattern3 = Pattern.compile(RegularExpression3);
        String s3 = "aaaaAAAS_D376456@gmail.com";
        Matcher matches3 = pattern3.matcher(s3);
        System.out.println("gmail " + matches3.matches());                        
    }
}
