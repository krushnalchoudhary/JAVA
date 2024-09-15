class Demo4{
    void m2(){
        System.out.println("Start m2");
        System.out.println(10/0);
        System.out.println("In m2");
    }

    void m1(){
        System.out.println("Start m1");
        m2();
        System.out.println("End m1");
    }


    public static void main(String[] args) {
        System.out.println("Start Main");
        Demo4 obj = new Demo4();
        obj.m1();
        System.out.println("End Main");
    }
}