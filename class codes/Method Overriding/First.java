class Parent1{
    Parent1(){
        System.out.println("In Parent Constructor");
    }

    void Property(){
        System.out.println("Home,Car,Gold");
    }

    void Marry(){
        System.out.println("Deepika Padukone");
    }
}


class Child1 extends Parent1{
    Child1(){
        System.out.println("In Child Constructor");
    }

    void Marry(){
        System.out.println("Alia Bhatt");
    }
}

class Client1{
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.Property();
        obj.Marry();
    }
}