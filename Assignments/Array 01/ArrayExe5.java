/*
 * WAP to take size of an array from user and also take integer elements from user 
 * print only elements that are divisible by 5
 */
import java.io.*;
public class ArrayExe5 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];


        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Array Elements divisible by 5:-");

        for(int i=0; i<arr.length; i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }


    }
}
