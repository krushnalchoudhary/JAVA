import java.io.*;
class Array7{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter Array Size");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int size = Integer.parseInt(br.readLine());
        int []arr = new int[size];
        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int temp =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum*10+arr[i];
        }

        System.out.println(sum);

    }
}