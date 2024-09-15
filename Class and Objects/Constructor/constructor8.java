class MacD {
    int no_of_items = 10;
    String str1 = "Fries";

    void menu(){
        String str2 = "Veg";
        String str3 = "Non-Veg";

        System.out.println(no_of_items);
        System.out.println(str1);
    }
}

class Users{
    public static void main(String[] args) {
        MacD OBJ = new MacD();
        OBJ.menu();
    }
}