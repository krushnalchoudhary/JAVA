/*
 * Method : public String concat (String str);
 * 
 * Description : concatenates one string to the end of another string
 *               implements new Array of Characters whose length is sum of both strings
 * 
 * Parameters : String
 * Return Type : String 
 */

import java.io.*;
public class Method1 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter First String");
        String str1 = br.readLine();

        System.out.println("Enter Second String");
        String str2 = br.readLine();

        int length = str1.length() + str2.length() ;

        System.out.println("Length = "+ length);

        if(str1.compareTo(str2)<=0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String str3 = str1.substring(0,1);
       str1  = str1.substring(1);

       str3 = str3.toUpperCase();
       str3 = str3.concat(str1);

       String str4 = str2.substring(0,1);
       str2 = str2.substring(1);

       str4 = str4.toUpperCase();
       str4 = str4.concat(str2);

       System.out.print(str3);
       System.out.println(str4);


       


        
    }
}
