/*
WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4

output:-5
 */

import java.io.*;
public class Arrayexe6 {
    public static void main(String[] args)throws IOException{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size of Array");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter Array Elements");

        int arr[] = new int[size];
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
    }
}
