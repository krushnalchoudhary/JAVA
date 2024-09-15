import java.io.*;
class Array6{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter Array Size");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int size = Integer.parseInt(br.readLine());

        System.out.println("Enter Array Elements");
        int arr [] = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        System.out.println("Enter Range");
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        for(int j=0; j<arr.length; j++){
            for(int i=A; i<=B; i++){
                if(arr[j]==i){
                    continue;
                }else{
                    System.out.println("False");
                    break;
                }
            }
        }
        
        System.out.println("true");
    }
}



