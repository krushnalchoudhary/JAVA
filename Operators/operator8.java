public class operator8 {
    public static void main(String[] args){
        int x = 5;
        int y = 7;
        //int ans = x<y && y>x; will generate error
        //System.out.println(ans); 

        // Correction

         boolean ans1 = x<y && y<x;
         boolean ans2 = x<y || y<x;

         System.out.println(ans1);
         System.out.println(ans2);
        
    }
    
}
