// Accessing Array elements


public class Array3 {
    public static void main(String[] args){
        int arr[] = new int[] {10,20,30,40,50};

        //method 1

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //method 2

        System.out.println("THIS IS SECOND METHOD/WAY TO ACCESS ARRAY ELEMENTS");

        for(int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }

    }
}
