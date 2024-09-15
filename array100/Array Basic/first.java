import java.io.*;
class Array1{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter size of Array");
        int x;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        x = Integer.parseInt(br.readLine());
        int[] arr = new int[x];

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter number to search");
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<arr.length; i++){
            if(num==arr[i]){
                System.out.println("Number is present");
                System.out.println(arr[i]);
                System.out.println("at index"+ i);
            }
        }
    }
}