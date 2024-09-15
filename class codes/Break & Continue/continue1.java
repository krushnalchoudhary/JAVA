import java.util.*;
public class continue1 {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if(i%3==0 && i%5==0 || i%4==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
