

import java.io.FileReader;
import java.io.IOException;

public class reading {
    public static void main(String[] args) {
        try{
            FileReader h = new FileReader("C:\\Users\\HP\\Desktop\\java project\\kh.txt");
            try{
                int i;
                while((i=h.read()) != -1){
                    System.out.print((char)i);
                }
                }
            finally{
                h.close();
            }
        }      
        catch(IOException e){
            System.out.println(e);
 }
        
      
    }
}
