class MyThread extends Thread{
    public static Thread nmMain;
    public static Thread nmName;

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("In Run");
        }
    }
}


class MyThreadDemo{
    public static void main(String[] args)throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();

        for(int i=0; i<10; i++){
            System.out.println("In Main");
            Thread.sleep(5000);
        }
    }
}