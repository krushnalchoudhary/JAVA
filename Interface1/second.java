interface Demo2{
    void fun();
    void gun();
}

abstract class DemoChild implements Demo2{
    public void gun(){
        System.out.println("In gun");
    }
}

class DemoChild1 extends DemoChild implements Demo{
    public void fun(){
        System.out.println("In Fun");
    }
}

class Client2{
    public static void main(String[] args) {
        Demo obj = new DemoChild1();
        obj.fun();
        obj.gun();
    }
}