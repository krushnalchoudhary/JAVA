class MyThread12 extends Thread{
    static Thread nmName = null;
    public void run(){
        try{
            nmName.join();
        }catch(InterruptedException ie){

        }

        for(int i=1; i<=10; i++){
            System.out.println("In Thread-0");
        }
    }
}

class ThreadDemo12{
    public static void main(String[] args)throws InterruptedException {

        Thread nmMain =  Thread.currentThread();
        
        MyThread12 obj = new MyThread12();
        obj.start();

        obj.join();

        for(int i=0; i<10;i++){
            System.out.println("In Main");
        }

    }
}