import java.io.*;
public class arraypract {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Enter rows");
        int row = Integer.parseInt(br.readLine());

        System.out.println("Enter column");
        int col = Integer.parseInt(br.readLine());
        int arr[][] = new int [row][col];

        System.out.println("Enter array elements");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }else{
                    System.out.print("__"+" ");
                }
            }
           System.out.println();
        }

    }
}
