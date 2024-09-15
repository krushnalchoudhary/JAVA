/*
C B A 
C B A 
C B A  */

public class nestedfor9 {
    public static void main(String[] args){
        char ch;
        
        for(int i = 1; i<=3; i++){
            ch = 'C';
            
            for(int j=1; j<=3; j++){
                System.out.print(ch+" ");
                ch--;
                
            }
            
            System.out.println();
            

        }

    }
}
