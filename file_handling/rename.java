
import java.io.File;

public class rename {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\HP\\Desktop\\java project\\kh.txt");
        File r = new File("C:\\Users\\HP\\Desktop\\java project\\rakshit.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else{
            System.out.println("didnot find file");
        }

        
    }
}
