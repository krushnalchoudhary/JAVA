/*
 error: non-static method fun() cannot be referenced from a static context
        fun();
        ^
1 error
 */

public class ArrayasArgs1 {
    public static void main(String[] args){

        fun();
    }
     void fun(){       
        System.out.println("In Fun");
    }
}


