
import java.io.*;

public class inputoutput {

    public static void main(String[] krishnal){

       try (// InputStreamReader isr = new InputStreamReader(System.in);
                //BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your birth year:");
            int year = Integer.parseInt(br.readLine());
            System.out.println("your birth year is"+year);
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
