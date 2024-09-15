import java.util.*;
class CricketPlayer{
    int jerNo = 0;
    String pName = null;

    CricketPlayer(int jerNo , String pName){
        this.jerNo = jerNo;
        this.pName = pName;
    }

    public String toString(){
        return jerNo +" "+pName;
    }
}

class ArrayListDemo2{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new CricketPlayer(18,"Virat"));
        al.add(new CricketPlayer (7, "MSD"));
        al.add(new CricketPlayer(45,"Rohit"));

        System.out.println(al);
    }
}