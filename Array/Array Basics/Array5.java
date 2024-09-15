//TAKING ARRAY ELEMENTS FROM USER...........

import java.io.*;
public class Array5 {
    public static void main(String[] args)throws IOException{
        int arr[] = new int [5];
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){

            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i =0; i<arr.length; i++){

            System.out.println(arr[i]);
        }
    }
}
