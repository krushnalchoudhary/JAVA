public class String9 {
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("Core2Web");

        long lval1 = System.identityHashCode(str1);

        str1.append("technologies");

        long lvar2 = System.identityHashCode(str1);

        if(lval1 == lvar2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        

    }
}
