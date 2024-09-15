import java.io.*;
class Input{
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String str = br.readLine();
        System.out.println(str);

        br.close();

        String str2 = br.readLine();
        System.out.println(str2);
    }
}


/*
Exception in thread "main" java.io.IOException: Stream closed
        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:122)
        at java.base/java.io.BufferedReader.implReadLine(BufferedReader.java:363)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:348)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:437)
        at Input.main(ExceptionHandling5.java:12) 
*/