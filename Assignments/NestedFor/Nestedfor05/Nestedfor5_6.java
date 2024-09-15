/*
Write a program, and take two characters if these characters are equal then print them as it is but if
they are unequal then print their difference.

{Note: Consider Positional Difference Not ASCIIs}
*/

import java.io.*;
public class Nestedfor5_6 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the First Character");
        char ch1 = (char) (br.read());
        br.skip(1);

        System.out.println("Enter the Second Character");
        char ch2 = (char) (br.read());

        int diff;

        if(ch1==ch2){
            System.out.println("Difference between both the character is Zero");
        }else{
            if(ch1>ch2){
                 diff = ch1 - ch2;  
                 System.out.println(diff);
            }else{
                diff = ch2 - ch1;
                System.out.println(diff);

            }
                      
        }
    }
}
