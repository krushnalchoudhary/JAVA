class Second{
    int x = 10;

    Second(){
        System.out.println("In no-arguement Constructor");
    }

    Second(int x){
        System.out.println("In Parameterised Constructor");
    }

    public static void main(String[] args) {
        Second sec1 = new Second();
        Second sec2 = new Second(10);
    }
}