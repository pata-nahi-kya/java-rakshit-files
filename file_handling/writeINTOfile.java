

import java.io.FileWriter;
import java.io.IOException;

public class writeINTOfile {
    public static void main(String[] args) throws IOException {
        try{
            FileWriter g = new FileWriter("C:\\Users\\HP\\Desktop\\java project\\kh.txt");
            try{
                g.write("hi there my father name is kishor chandgadhiya");
            }
            finally{
                g.close();
            }
            System.out.println("sucessfully written in file");
        }
        catch(IOException e){
            System.out.println("exception handle");

        }

    }
}
