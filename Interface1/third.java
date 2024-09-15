interface Demo3{
    void fun();
}

interface Demo4{
    void fun();
}

class DemoChild3 implements Demo3 , Demo4{
    public void fun(){
        System.out.println("In Fun Child");
    }
}


class Client3{
    public static void main(String[] args) {
        Demo3 obj = new DemoChild3();
        obj.fun();
    }
}