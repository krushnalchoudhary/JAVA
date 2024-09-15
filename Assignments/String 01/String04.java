/*
Write a Program to find min and max element in array
 EXAMPLE :
I/P Int arr[] = {5,3,1,2,9};
 O/P MIN=1
     MAX=9
 */

import java.io.*;
public class String04 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Dimensions");
         int size= Integer.parseInt(br.readLine());

         int arr[] = new int[size];

         System.out.println("Enter Array Elements");
         for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
         }

         int num= arr[0];

        for(int i=1; i<arr.length; i++){
            if(num<arr[i]){
                num=arr[i];
            }
        }
        System.out.println("Max="+num);

        num = arr[0];
        for(int i=1; i<arr.length; i++){
            if(num>arr[i]){
                num=arr[i];
            }
        }
        System.out.println("Min="+num);

    }
}
