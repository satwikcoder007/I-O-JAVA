import java.io.*;

public class BufferReaderDemo{

    public static void main(String[] args) throws IOException
    {
        BufferedReader bf =  new BufferedReader(new InputStreamReader(System.in));
        String ans;
        System.out.print("enter your text:");
        ans = bf.readLine();
        if(ans.compareTo("satwik")==0){
            System.out.println("Success");
        }
        else System.out.println("Biswas");
    }
}