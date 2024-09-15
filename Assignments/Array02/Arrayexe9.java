import java.io.*;
public class Arrayexe9 {
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        int size;
        int sum = 0;

        System.out.println("Enter Size of An Array");
        size = Integer.parseInt(br.readLine());
        int arr1[] = new int[size];
        int arr2[] = new int [size];


        System.out.println("Enter Array Elements");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = Integer.parseInt(br.readLine());            
        }

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr2.length; i++){
            arr2[i] = Integer.parseInt(br.readLine());
        }

        size = arr1.length + arr2.length;



        int arr3[] = new int [size];

        for(int i=0; i<arr1.length; i++ ){

            arr3[i] = arr1[i];
        }

            for(int j=0; j<arr1.length; j++){
                arr3[arr1.length+j] = arr2[j];
            }
        

       System.out.println("Ans");
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);

        }

    }
}
