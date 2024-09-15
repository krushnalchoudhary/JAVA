class Demo3{
    int x = 10;
    static int y =20;

    static{
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        Demo3 obj = new Demo3();
        System.out.println(obj.x);
    }
}