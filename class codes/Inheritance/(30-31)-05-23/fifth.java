class Parent5{
    static{
        System.out.println("In Parent Static Block");
    }
}

class Child5 extends Parent5{
    static {
        System.out.println("In Child Static Block");
    }
}


class Client5{
    public static void main(String[] args) {
        Child5 obj = new Child5();
        
    }
}