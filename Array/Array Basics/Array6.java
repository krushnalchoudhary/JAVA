import java.io.*;
public class Array6 {
    public static void main(String[] args)throws IOException{

        int arr1[] = new int []{10,20,30,40,50};
        char ch[] = new char[]{'A','B','C','D'};
        float arr2[] = new float[]{10.20f,20.10f};
        boolean arr3[] = new boolean[]{true,false};

        System.out.println("These Are The Elements of Integer Array i.e. arr1");
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }


        System.out.println("These Are The Elements of character Array i.e. ch");
        for(int i = 0; i<ch.length; i++){
            System.out.println(ch[i]);
        }


        System.out.println("These Are The Elements of float  Array i.e. arr2");
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }


        System.out.println("These Are The Elements of Boolean Array i.e. arr3");
        for(int i = 0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
    }
}
