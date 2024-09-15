/*
 5 4 3 2 1 
8 6 4 2 
9 6 3 
8 4 
5 
 */


import java.io.*;
public class MS3 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter rows");
        int row = Integer.parseInt(br.readLine());   
        int num = row;   

        for(int i=1; i<=row; i++){
            
            int num1 = num*i;

            for(int j=row; j>=i; j--){
                System.out.print(num1+" ");
                num1= num1-i;
            }
            System.out.println();
            num--;
        }


    }
}
