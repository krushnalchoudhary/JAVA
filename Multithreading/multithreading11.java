class MyThread11 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("In Thread-0");
        }
    }
}

class ThreadDemo11{
    public static void main(String[] args) throws InterruptedException{
        MyThread11 obj = new MyThread11();
        obj.start();

        obj.join();

        for(int i=0; i<10; i++){
            System.out.println("In Main");
        }
    }
}