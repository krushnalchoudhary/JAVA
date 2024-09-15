class fourth{
    int x = 10;
    fourth(){
        System.out.println(this.x);
        System.out.println(x);
    }

    fourth(int x){
        this.x = x;
        System.out.println(this.x);
        System.out.println(x);
    }

    public static void main(String[] args) {
        fourth obj = new fourth();
        fourth obj1 = new fourth(50);
    }
}