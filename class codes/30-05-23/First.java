class player{
    private int jerNo = 10;
    private String name = null;

    player(int jerNo , String name){
        this.jerNo = jerNo;
        this.name = name;
        System.out.println("In Constructor");
    }

    void info(){
        System.out.println(jerNo + " = "+ name);
    }
}


class Client{
    public static void main(String[] args) {
        player obj1 = new player(18 , "Virat");
        obj1.info();

        player obj2 = new player(7, "MSD");
        obj2.info();

        player obj3 = new player(45,"Rohit");
        obj3.info();
    }
}