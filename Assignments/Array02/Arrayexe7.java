/*
WAP to find the common elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Common elements :
1
2
 */

import java.io.*;
public class Arrayexe7 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size of Array");
        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter First Array Elements");

        int arr1[] = new int[size];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Second Array Elements");

        int arr2[] = new int[size];
        for(int i=0; i<arr2.length; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Common elements in both Arrays are:-");
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}
