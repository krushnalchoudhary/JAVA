public class nestedfor25 {
    public static void main(String[] args){
        int N =4;
        int num=64;
        for(int i=1; i<=N; i++){
            
            num = num + i;
            for(int j=N; j>=i; j--){
                System.out.print((char)num +" ");
                num++;
            }
            System.out.println();
        }
    }
    
}
