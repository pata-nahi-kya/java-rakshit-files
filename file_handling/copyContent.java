

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyContent {
    public static void main(String[] args)throws IOException {
        FileInputStream f = new FileInputStream("C:\\Users\\HP\\Desktop\\java project\\tmkoc.txt");
        FileOutputStream g = new FileOutputStream("C:\\Users\\HP\\Desktop\\java project\\tmkoccopy.txt");
        int i ;
        while((i = f.read()) != -1){
            g.write(i);
        }
        System.out.println("data copied");
        f.close();
        g.close();
    }    
}
