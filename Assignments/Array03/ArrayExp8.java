import java.io.IOException;

/*
 * Write a program to find an Armstrong number from an Array and return its index
 * Take size and elements from user
 */

 import java.io.*;
public class ArrayExp8 {
   
    static void armStrong(){
	
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter the Size/Dimensions ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter Array Elements");

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
	
	}

        for(int i=0; i<arr.length; i++){
            int num=arr[i];
            int count=0;
            int sum=0;
            while(num!=0){
                count++;
                num=num/10;
            }
            int temp = arr[i];
            while(temp!=0){
                int mult = 1;
                int num2 = temp%10;
                for(int j=1; j<=count; j++){
                    mult = mult*num2;
                }
                sum = sum+mult;
                temp = temp/10;
            }
            if(sum==arr[i]){
                System.out.println("Armstrong no "+arr[i]+" Found at index "+i);
            }
        }
        
    }
    public static void main(String[] args)throws IOException{
        armStrong();
       
    }
}


