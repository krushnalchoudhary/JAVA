/*
# = = = = 
= # = = = 
= = # = = 
= = = # = 
= = = = # */

import java.io.*;
public class MS2 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the rows");
        int row = Integer.parseInt(br.readLine());


        System.out.println("Enter the columns");
        int col = Integer.parseInt(br.readLine());

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(j==i){
                    System.out.print("#"+" ");
                }else{
                    System.out.print("="+" ");
                }

            }
            System.out.println();
        }

        
    }
    
}
