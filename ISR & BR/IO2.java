import java.io.*;
public class IO2 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(null);

        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Name of Building");
        String Bname = br.readLine();

        System.out.println("Enter Wing");
        char wing = (char)br.read();

        System.out.println("Enter Flat no.");
        int ftno = Integer.parseInt(br.readLine());


        System.out.println(Bname);
        System.out.println(wing);

        System.out.println(ftno);

        

  

    }

    }

        

