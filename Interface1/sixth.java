interface Demo8{
    void gun();
    default void fun(){
        System.out.println("In Fun-Demo");
    }
}

class DemoChild8 implements Demo8{
    public void gun(){
        System.out.println("In gun Demo-Child");
    }
}

class Client8{
    public static void main(String[] args) {
        Demo8 obj = new DemoChild8();
        obj.fun();
        obj.gun();
    }
}