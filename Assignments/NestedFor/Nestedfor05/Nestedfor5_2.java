
/*
# = = = = = 
= # = = = = 
= = # = = = 
= = = # = = 
= = = = # = 
= = = = = # */


import java.io.*;
public class Nestedfor5_2 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr );

        System.out.println("Enter rows");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter columns");
        int col = Integer.parseInt(br.readLine());

        for(int i=0; i<= row; i++){
            for(int j=0; j<=col; j++){
                if(i==j){
                    System.out.print("#" +" ");
                }else{
                    System.out.print("="+" ");
                }
            }
            System.out.println();
        }
        
    }
}
