/*
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
 */

import java.io.*;
public class Arrayexe4{
    public static void main(String[] args)throws IOException{

        System.out.println("Enter Array Dimensions");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());   
        }

        System.out.println("Enter the element you want to search");
        int num = Integer.parseInt(br.readLine());
        for(int  i=0; i<arr.length; i++){
            if(num==arr[i]){
                System.out.println("Element Found at index "+i);
            }
        }

    }
}
