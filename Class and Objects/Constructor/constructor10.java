class Employee{
    int empId = 10;
    String str = "Kanha";

    void empInfo(){
        System.out.println("Id = "+empId);
        System.out.println("name = "+str);
    }
}

class mainDemo{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empInfo();

        System.out.println(emp.empId);
        System.out.println(emp.str);
    }
}