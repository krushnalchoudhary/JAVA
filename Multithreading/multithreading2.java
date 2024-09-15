class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("In Run");
        }
    }
}


class MyThreadDemo2{
    public static void main(String[] args)throws InterruptedException {
        MyThread obj = new MyThread();
        obj.start();

        for(int i=0; i<10; i++){
            System.out.println("In Main");
        }
    }
}