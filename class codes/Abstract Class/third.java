abstract class Parent3{
    void career(){
        System.out.println("Engineer");
    }
    abstract void Marry();
}


class Child3 extends Parent3{
    void Marry(){
        System.out.println("--------");
    }
}


class Client3{
    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.career();
        obj.Marry();
    }
}