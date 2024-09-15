class MyThread10 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

class ThreadDemo10{
    public static void main(String[] args)throws InterruptedException {
        System.out.println(Thread.currentThread());

        MyThread10 obj = new MyThread10();
        obj.start();

        Thread.sleep(1000);

        Thread.currentThread().setName("Core2Web");
        System.out.println(Thread.currentThread());
    }
}