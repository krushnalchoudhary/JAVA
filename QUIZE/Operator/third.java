
public class third {
    static int var = 2;

    public static void main(String[] args){
        var = (var=4)*(++var);
        System.out.println(var);
    }
}


/*Options
 * 12
 * 17
 * 20
 * 9
 */