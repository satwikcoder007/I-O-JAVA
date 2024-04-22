import java.io.*;

public class DataOutputStreamDemo  //still not clear
{
    public static void main(String[] args)throws Exception {
        
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("abc.txt")));
        
        dos.writeBytes("satwik");
        dos.writeInt(60);
        dos.close();
    }
}
