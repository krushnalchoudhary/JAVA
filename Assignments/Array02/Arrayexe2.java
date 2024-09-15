/*
 * WAP to print count of even and odd elements
 */
import java.io.*;
public class Arrayexe2 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;
        int count = 0;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

       

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]%2==0){
                count++;
            }
        }

        System.out.println(" Elements Inserted ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        size = arr.length - count;
        System.out.println("Count of Even no in Array: "+count);
        System.out.println("Count of odd no in Array: "+size);
    
    }
}
