import java.io.*;
public class eight {
    public static void main(String[] args)throws IOException {
    
        System.out.println("Enter Array Size");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter Array Elements");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count;
        int num;
        int []arr2 = new int[size];
        for(int i=0; i<arr.length; i++){
            num = arr[i]; 
            count=0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]==num);{
                    count++;
                    for(int k=i; k<arr2.length; k++){
                        for(int h=0; h<arr2.length; h++){
                            if(num!=arr2[j]){
                                arr2[k] = num;
                            }else{
                                continue;
                            }
                        }
                    }
                }
            }
            if(count%2==0){
                System.out.println(num);
            }else{
                continue;
            }

        }
        
    }
}
