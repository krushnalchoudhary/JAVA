import java.util.*;
class CricPlayer{
    int jerNo = 0;
    String pName = null;
    CricPlayer(int jerNo , String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }
}

class LinkedHashSetDemo2{
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(new CricPlayer(18, "Virat"));
        lhs.add(new CricPlayer(7, "MSD"));
        lhs.add(new CricPlayer(45, "Rohit"));
        lhs.add(new CricPlayer(7, "MSD"));

        System.out.println(lhs); 

    }
}