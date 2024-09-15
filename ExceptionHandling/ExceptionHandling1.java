//IO Exception :- Compile Time Exception


import java.io.*;
class Demo{
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
    }
}


/*error: unreported exception IOException; must be caught or declared to be thrown
        String str = br.readLine();
                                ^
1 error

*/

