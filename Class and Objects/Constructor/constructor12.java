 class Company {
    int x = 10;
    private int y = 20;
    static int z = 30;

    void disp(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}

class Client{
    public static void main(String[] args) {
        Company cp1 =  new Company();
        Company cp2 =  new Company();

        cp1.disp();

        cp1.x = 100;
        cp2.z = 300;

        cp1.disp();
        cp2.disp();
    }
}
