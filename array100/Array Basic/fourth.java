import java.io.*;
class Array4{
    public static void main(String[] args)throws IOException {
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

        int mul =1;
        for(int i=0; i<arr.length; i++){
            mul = mul*arr[i];
        }

        System.out.println(mul);
    }
}