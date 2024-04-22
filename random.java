import java.io.FileInputStream;

class FileInputStreamDemo{
    public static void main(String[] args) 
     {
        int nextByte;
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("./satwik.txt");
            while((nextByte=fis.read())!=-1){
                System.out.print((char)nextByte);
            }
            
        } catch (Exception e) { 
           System.out.println("FIle is not found");
        }
        finally{
            try {
                fis.close();
            } catch (Exception e) {
                System.out.println("FIle is not found");
            }
        }

        
    }
}