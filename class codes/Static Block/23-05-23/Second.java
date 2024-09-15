class Demo{
    static{
        System.out.println("Static Block");
    }
    public static void main(String[] args) {
        System.out.println("In main");
    }
}

class Client{
    static{
        System.out.println("Static Block2");
    }

    public static void main(String[] args) {
        System.out.println("In Client Main");
    }
}