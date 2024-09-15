class example{
    int x = 10;

    example(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Instance Block 1");
    }

    public static void main(String[] args) {
        example exp = new example();
        
    }
}