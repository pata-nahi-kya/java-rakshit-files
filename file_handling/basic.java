
// always write in try catch block so that error aaye toh 
// handle ho saake
import java.io.File;
import java.io.IOException;

public class basic {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\HP\\Desktop\\java project\\LC.txt"); // use double "//" coloumn in path
        if(f.createNewFile()){
            System.out.println("successfully created");
        }
        else{
            System.out.println("file already there....");
        }
        if(f.exists()){
            System.out.println("file name " + f.getName());
            System.out.println("file path " + f.getPath() );
            System.out.println("file readable " + f.canRead());
            System.out.println("file writeable " + f.canWrite() );
            System.out.println("file size " + f.length() );
        }
        else{
            System.out.println("already exist ....");
        }
    }
}
