/*
 * Write the program to print count of digits in element of Array
 */

import java.io.*;
 public class ArrayExp1 {
    
    static void count()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size/Dimensions ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter Array Elements");

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int  count;
        for(int i=0; i<arr.length; i++){
            count=0;
            while(arr[i]!=0){
                arr[i]= arr[i]/10;
                count++;
            }
            System.out.println(count+" ");
        }
    }

    public static void main(String[] args)throws IOException{
        count();
    }
}
