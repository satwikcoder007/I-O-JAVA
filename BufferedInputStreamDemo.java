import java.io.*;
class random{
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        int nb;

        try {

            bis = new BufferedInputStream(new FileInputStream("abc.txt"));
            while((nb=bis.read())!=-1){
                System.out.print((char)nb);
            }
            
        } catch (Exception e) {
            System.out.println("Some error occured");
        }
        finally{
            try {
                bis.close();  
            } catch (Exception e) {
                System.out.println("Some error occured");
            }
        }
    }
}