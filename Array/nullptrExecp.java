package Array.Array Basics;

public class nullptrExecp {
    public static void main(String[] args) {
        int arr1[][] = {{},{},{}};
        int arr2[][] = new int[2][];

        System.out.println(arr1.length);           //3
        System.out.println(arr[0].length);         //0

        System.out.println(arr2.length);           //2
        System.out.println(arr2[0].length);        //null pointer exception
    }
}
