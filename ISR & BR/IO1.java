import java.io.*;
public class IO1 {
    public static void main(String[] args)throws IOException{
        String str;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        BufferedReader br1 = new BufferedReader(isr);

        System.out.println("Enter String");

        str = br.readLine();
        br.close();

        System.out.println("Enter");
        str = br1.readLine();

    }
}
