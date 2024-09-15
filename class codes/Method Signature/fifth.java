class fifth{
    int x = 10;
    fifth(){
        this(70);
        System.out.println("In No-Args Constructor");
    }

    fifth(int x){
        this();
        System.out.println("In Para-Constructor");
    }

    public static void main(String[] args) {
        fifth obj = new fifth();
    }
}


/* error: recursive constructor invocation
    fifth(){
    ^
1 error
 */