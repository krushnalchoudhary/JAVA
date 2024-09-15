class Demo3{
    void m1(){
        System.out.println(10/0);
        System.out.println("In m1");
    }

    void m2(){
        System.out.println("In m2");
    }


    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.m1();
    }
}


/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo3.m1(ExceptionHandling3.java:3)
        at Demo3.main(ExceptionHandling3.java:14)
 */