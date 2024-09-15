
public class Core2Web2 {
        int var1 = 10;
        public static void main(String[] args){
            Core2Web c2w = new Core2Web();
            System.out.println(++c2w.var1);
        }
}

class main{
    public static void main(String[] args){
        System.out.println("in main");
        Core2Web c2w = new Core2Web2();
        System.out.println(++c2w.var1);
    }
}
