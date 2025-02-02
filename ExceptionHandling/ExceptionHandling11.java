import java.util.Scanner;
class DataOverFlowException extends RuntimeException{
    DataOverFlowException(String msg){
        super(msg);
    }
}

class DataUnderFlowException extends RuntimeException{
    DataUnderFlowException(String msg){
        super(msg);
    }
}

class UserDefinedExceptionDemo{
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter Integer Value");
        System.out.println("Note: 0<element<100");

        for(int i=0; i<arr.length; i++){
            int data  = sc.nextInt();

            if(data<0){
                throw new DataUnderFlowException(" Mitra Data Zero peksha kami aahe");
            }

            if(data>100){
                throw new DataOverFlowException("Mitra data 100 peksha jast aahe");
            }

            arr[i] = data;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}