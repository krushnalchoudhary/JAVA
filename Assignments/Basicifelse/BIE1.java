import java.util.*;

class BIE1 {

    public static void main(String[] args){

        int var;
        System.out.println("Enter Value");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        if(var%2==0){
            System.out.println(var+"is an even number");
        }else{
            System.out.println(var+"is an odd number");
        }
    }
}

