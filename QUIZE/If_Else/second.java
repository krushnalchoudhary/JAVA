
public class second {
    public static void main(String[] args){
        if(true)
            if(false)
            System.out.println("Inside if");
            else
            System.out.println("Inside else1");
            else
            System.out.println("Inside else2");
    }
}


/*Options
 * Inside else1
 * Inside else2
 * Inside if
 * Compile time error
 */
