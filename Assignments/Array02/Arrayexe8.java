/*
WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;
class Arrayexe8{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter size of first array");
        int size = Integer.parseInt(br.readLine());
        
        int arr1[] = new int[size];

        System.out.println("Enter elements of first Array");
        
        for(int i=0; i<arr1.length; i++){
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of Second array");
        size = Integer.parseInt(br.readLine());
        
        int arr2[] = new int[size];

        System.out.println("Enter elements of Second Array");
        
        for(int i=0; i<arr2.length; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        int count=0;
        System.out.println("Uncommon elements between both arrays are");

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){

                if(arr1[i]==arr2[j]){
                    count = 1;
                }
            }
            if(count == 0){
                System.out.println(arr1[i]);
            }

            count = 0;
        }
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){

                if(arr2[i]==arr1[j]){
                    count = 1;
                }
            }
            if(count == 0){
                System.out.println(arr2[i]);
            }
            count = 0;
        }
    }
}