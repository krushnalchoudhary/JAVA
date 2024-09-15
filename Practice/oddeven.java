

import java.io.*;
public class oddeven{
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter start no");
        int str= Integer.parseInt(br.readLine());

        System.out.println("Enter End number");
        int end = Integer.parseInt(br.readLine());
        int a= end;
        int b = str;


        for(int i=str; i<=end; i++){
            if(i%2!=0){
               System.out.print(i+" ");
               
            }
        }
        System.out.println();
        for( int j =end; j>=str; j--){
                if(j%2==0){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
    }
   
}

