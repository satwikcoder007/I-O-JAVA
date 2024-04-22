import java.util.*;
import java.io.*;
public class ScannerDemo {
    
    public static void main(String[] args) 
    {
        try( Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Name:");
            String name = sc.nextLine();
            System.out.println("Enter Gender:");
            char gender = sc.next().charAt(0);
            System.out.println("Enter Email:");
            sc.nextLine();
            String email = sc.nextLine();
            System.out.println("Enter Age:");
            int age = sc.nextInt();

            System.out.println(name+age+gender+email);
        }
        catch(Exception e){

        }
        
    }

}
