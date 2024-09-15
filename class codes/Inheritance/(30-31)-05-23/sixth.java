 class Parent6 {
    static int x = 10;

    static{
        System.out.println("In Parent Static Block");
    }

    static void access(){
        System.out.println(x);
    }
}

class Child6 extends Parent6{
    static {
        System.out.println("In Child Static Block");
        System.out.println(x);
        access();
    }
}


class Client6{
    public static void main(String[] args) {
        System.out.println("In Main");
        Child6 obj = new Child6();
    }
}