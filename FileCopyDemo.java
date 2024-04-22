import java.io.*;

public class FileCopyDemo 
{
    public static void main(String[] args) throws IOException,FileNotFoundException{
        
        
        int nb;

        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("satwik.txt");

        while((nb=fis.read())!=-1){
            fos.write((char)nb);
        }

        fis.close();
        fos.close();


    }
}