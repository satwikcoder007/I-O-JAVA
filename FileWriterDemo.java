import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) {
        File f1 = new File("satwik.txt");
        try(FileWriter fw = new FileWriter(f1))
        {
            fw.write("satwik BIswas");
            fw.write("\nHey There");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
