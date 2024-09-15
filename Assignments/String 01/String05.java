/*
Write a Program to find second min and second max element in array
EXAMPLE :
I/P Int arr[] = {5,3,1,2,9};
 O/P MIN=2
     MAX=5
 */


 import java.io.*;
public class String05 {
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
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest number = "+arr[arr.length-2]);

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second minimum number = "+arr[arr.length-2]);

    }
}
