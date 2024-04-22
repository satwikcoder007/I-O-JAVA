import java.io.*;
public class DataInputStreamDemo {
    
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("abc.txt")));
        int nb;
        while((nb = dis.readByte())!=-1){
            System.out.print((char)nb);
        }
        dis.close();
    }
}
