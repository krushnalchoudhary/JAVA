import java.util.*;

public class BIE7 {
    
    public static void main(String[] args){

        double selling_price;
        double cost_price;

         System.out.println("Enter Cost Price");
         Scanner cp = new Scanner(System.in);
         cost_price = cp.nextDouble();

         System.out.println("Enter Selling Price");
         Scanner sp = new Scanner(System.in);
         selling_price = sp.nextDouble();

         double profit = selling_price - cost_price;
         double loss = cost_price - selling_price;

         if(selling_price>=0 && cost_price>=0){
            if(selling_price==cost_price){
                System.out.println("Selling price and Cost price are Equal");
            }else if(selling_price>cost_price){
                System.out.println("Profit of"+profit);
            }else if(cost_price>selling_price){
                System.out.println("Loss of"+loss);
            }
         }else{
            System.out.println("Invalid Entry:Selling Price and Cost Price can't be Negative");
         }

    }
}
