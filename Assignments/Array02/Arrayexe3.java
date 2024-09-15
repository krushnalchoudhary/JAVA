
/*
 * WAP to take size of an array from user and also take integer elements from user 
 * print sum of odd elements and even elements
 */
import java.io.*;
public class Arrayexe3 {
    public static void main(String[] args)throws IOException{

        int size;
        int sum1=0;
        int sum2=0;

        System.out.println("Enter size of Array");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());


            if(arr[i]%2==0){
                sum1 = sum1 + arr[i];
            }else{
                sum2 = sum2+arr[i];
            }
        }
        System.out.println("Sum of Even elements:"+sum1);
        System.out.println("Sum of odd elements:"+sum2);


    }
}

