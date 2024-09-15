import java.io.*;
class Array3{
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

        int max=arr[0]; 
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }

            
        }
        System.out.println(max);
        
    }
   
}
    
