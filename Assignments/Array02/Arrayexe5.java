/*
WAP to take size of array from user and also take integer elements from user
find the minimum element from the array
 */

 import java.io.*;
 class Arrayexe5{
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size of Array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.println("Enter Array Elements");

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int num= arr[0];

        for(int i=1; i<arr.length; i++){
            if(num>arr[i]){
                num=arr[i];
            }
        }
        System.out.println("Min="+num);
    }
 }