/*
 * WAP to take size of an array from user and also take integer elements from user 
 * print product of odd index elements only
 */
import java.io.*;
public class ArrayExe3 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;
        int product= 1;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];


        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(i%2!=0){
                product = product * arr[i];
            }
        }

        System.out.println("product of odd elements present at odd Index  in array =" +product);

    }
}
