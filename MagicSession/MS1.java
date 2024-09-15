/*
E5 D4 C3 B2 A1 
A1 B2 C3 D4 E5 
E5 D4 C3 B2 A1 
A1 B2 C3 D4 E5 
E5 D4 C3 B2 A1 
 */


import java.io.*;
public class MS1 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr );

        System.out.println("Enter the rows");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter the colms");
        int col = Integer.parseInt(br.readLine());
       

       for(int i=1; i<=row; i++){
        char ch  = 'A';
        int num = row;
        char ch1 = (char) (ch + row-1);
        for(int j=1; j<=col; j++){
            if(i%2!=0){
                System.out.print((ch1));
                System.out.print(num+" ");
                ch1--;
                num--;

            }else{
                System.out.print((ch));
                System.out.print(j+" ");
                ch++;
            }
        }
        System.out.println();
    }
}
}
                
            

        
       



    

