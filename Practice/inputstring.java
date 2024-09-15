
import java.io.*;


public class inputstring {

    public static void main(String[] args)throws IOException{
        System.out.println("Enter aa string");
    

        //Scanner sc = new Scanner(System.in);
       // s = sc.next();

      //  System.out.println(s);

         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         String ss = br.readLine();

         
         System.out.println(ss);   
    }
    
}
