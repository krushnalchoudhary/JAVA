
import java.io.*;
public class MS4{
    public static void main(String[] args) throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter start no");
        int str= Integer.parseInt(br.readLine());

        System.out.println("Enter End number");
        int end = Integer.parseInt(br.readLine());
        int a= end-1;
        int b = str;


        for(int i=str; i<=end; i++){
            if(i%2!=0){
                System.out.print(b+" ");
                b=b+2;
               
            }
        }
        System.out.println();
        for( int j =str; j<=end; j++){
            if(j%2==0){
                System.out.print(a+" ");
                a=a-2;
            }

    }
    System.out.println();
}
}
