import java.util.*;

public class BIE9 {
    public static void main(String[] args){
        int hypotenuse;
        int base;
        int height;

        System.out.println("Enter Hypotenuse");
        Scanner h = new Scanner(System.in);
        hypotenuse = h.nextInt();

        System.out.println("Enter Base");
        Scanner b = new Scanner(System.in);
        base = b.nextInt();
        
        System.out.println("Enter Height");
        Scanner l = new Scanner(System.in);
        height = l.nextInt();

        int x = height*height + base*base;
        int y = hypotenuse*hypotenuse;

        if(hypotenuse>0 && base>0 && height>0){
            if(hypotenuse>base && hypotenuse>height){
                if(hypotenuse!=base && base!=height){
                    if(x==y){
                        System.out.println("Triplets");
                    }else if(x!=y){
                        System.out.println("Not Triplets");
                    }
                }else{
                    System.out.println("Enter Unique Values");
                }
            }else{
                System.out.println("Invalid Entry : Hypotenuse should be greater than Base and Height");
            }
        }else{
            System.out.println("Invalid Entry : Hypotenuse,Base and Height can't be Zero or Negative");
        }

       
        
    }
}

