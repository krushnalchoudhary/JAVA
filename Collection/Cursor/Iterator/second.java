import java.util.ArrayList;

class CursorDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20.5f);
        al.add(30.5f);
        al.add("C2W");

        for(var x:al){
            System.out.println();
        }
    }
}