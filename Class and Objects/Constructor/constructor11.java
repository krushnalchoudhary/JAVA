class Example {
    int empId = 10;
    String str = "Kanha";
    static int y = 50;

    void empInfo(){
        System.out.println(empId);
    }
}

class MainExample{
    public static void main(String[] args) {
        Example eg1 = new Example();
        Example eg2 = new Example();

        eg1.empInfo();
        eg2.empInfo();

        eg2.empId = 20;
        eg2.str = "Rahul";
        eg2.y = 5000;

        eg1.empInfo();
        eg2.empInfo();


    }
}