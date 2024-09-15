import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap hs = new HashMap();
        hs.put(27,"c2w");
        hs.put(18,"infosys");
        hs.put(10, "Barklays");
        //hs.put(16,"BMC");

        System.out.println(hs);
        System.out.println(new Integer(13).hashCode());
    }
}