interface Demo5{
    static void m1(){
        System.out.println("Demo5-m1");
    }
}

interface Demo6{
    static void m1(){
        System.out.println("In Demo6-m1");
    }
}

interface Example extends Demo5 , Demo6{

}


class DemoChile6 implements Example{
    public static void main(String[] args) {
        Demo5 obj = new DemoChile6();
        obj.m1();
    }
}