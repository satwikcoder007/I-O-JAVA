import java.io.*;

public class FileStreamDemo {
    
    public static void main(String[] args) throws IOException,FileNotFoundException
     {
        
        FileReader fr = new FileReader("abc.txt");
        int nextByte;
        while((nextByte=fr.read())!=-1){
            System.out.print((char)nextByte);
        }
        fr.close();

        //We can also wrap the FileReader with the BufferedReader so thst we can read the file line by line not by charecter
        
        // BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        // String line;
        // while((line=br.readLine())!=null){
        //     System.out.println(line);
        // }
        // br.close();
    }

}
