class Demo6{
    public static void main(String[] args) {
        System.out.println("Start Main");

        try{
            System.out.println(10/0);
        }catch(ArithmeticException obj){
            System.out.println("Exception Occurred");
        }

        System.out.println("End Main");
    }
}