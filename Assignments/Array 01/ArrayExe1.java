/*
 * WAP to take size of an array from user and also take integer elements from user 
 * print sum of odd elements only
 */
import java.io.*;
public class ArrayExe1 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;
        int sum = 0;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];


        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]%2!=0){
                sum = sum+ arr[i];
            }
        }

        System.out.println("Sum =" +sum);

    }
}
