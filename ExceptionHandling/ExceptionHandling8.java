class FinallyBlockDemo{
    void m1(){

    }

    void m2(){

    }

    public static void main(String[] args) {
        FinallyBlockDemo fbd = new FinallyBlockDemo();
        fbd.m1();
        
        fbd = null;

        try{
            fbd.m2();
        }catch(NullPointerException obj){
            System.out.println("Here");
        }finally{
            System.out.println("Connection Closed");
        }

        System.out.println("End Main");
    }
}