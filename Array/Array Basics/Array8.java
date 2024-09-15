//Taking array Dimension/Size from user.........

import java.io.*;
public class Array8 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println(arr.length);
        System.out.println(size);

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(" Elements Inserted ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
