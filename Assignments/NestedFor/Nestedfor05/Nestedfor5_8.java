/*
write a program to print the following pattern

$
@ @
& & &
# # # #
$ $ $ $ $
@ @ @ @ @ @
& & & & & & &
# # # # # # # #

 */

 import java.io.*;
public class Nestedfor5_8 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter number of rows");

        int row = Integer.parseInt(br.readLine());

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                if(i%4==1){
                    System.out.print("$"+" ");
                }else if(i%4==2){
                    System.out.print("@"+" ");
                }else if(i%4==3){
                    System.out.print("&"+" ");
                }else if(i%4==0){
                    System.out.print("#"+" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
