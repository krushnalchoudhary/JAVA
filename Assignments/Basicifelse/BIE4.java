import java.util.*;

public class BIE4 {

    public static void main(String[] args){
         
        int var;
        System.out.println("Enter The number ");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        System.out.println("you have entered "+var);
        if(var<=5){
            if(var==0){
                System.out.println("Zero");
            }else if(var==1){
                    System.out.println("One");
                  }else if(var==2){
                    System.out.println("Two");
                  }else if(var==3){
                    System.out.println("Three");
                  }else if(var==4){
                    System.out.println("Four");
                  }else if(var==5){
                    System.out.println("Five");
                  }else {
                    System.out.println("Invalid Entry");
                  }
                  
                  }
                    
        else{
            System.out.println("You have entered invalid number");
        }        
        }
    }
    

