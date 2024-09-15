public class String10 {
    public static void main(String[] args){
        String svar = "Core2Web";
        StringBuffer str1 = new StringBuffer("Core2Web");

        if(svar.equals(str1)){
            System.out.println("Equal");
        }else{
            System.out.println("not equal");
        }   
    }
}
