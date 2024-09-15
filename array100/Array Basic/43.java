import java.io.*;
class Array43{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter Size");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter Array Elemnts");

        for(int i=0; i<arr.length; i++){
            arr[i] =Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the Range");
        int str = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());


        System.out.println(arr[-1]);
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=str && arr[i]<=end){
                count++;
            }
        }

        System.out.println(count);

    }
}