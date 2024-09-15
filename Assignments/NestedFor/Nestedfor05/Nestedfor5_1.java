/*
 D4 D3 D2 D1 
A1 B2 C3 D4 
D4 D3 D2 D1 
A1 B2 C3 D4 
 */


import java.io.*;
public class Nestedfor5_1 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr );

        System.out.println("Enter the number of Rows");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter no of columns");
        int col = Integer.parseInt(br.readLine());
        for(int i=1; i<=row; i++){
            int num = col;  char ch = 'A';
            char ch1 = (char) (ch + col - 1);
            for(int j=1; j<=col; j++){
                if(i%2!=0){
                    System.out.print( ch1);
                    System.out.print(num+" ");
                    num--;
                    ch--;
                }else{
                    System.out.print(ch);
                    System.out.print(j+" ");
                    ch++;
                    num++;
                }
            }
            System.out.println();
        }
        
    }
}
