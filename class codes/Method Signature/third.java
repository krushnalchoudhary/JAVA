class third{
    int x = 10;
    third(){
        System.out.println("In no-args");
    }

    third(int x){
        System.out.println("In Para");
        //this(); ----> Error 
                               // This shoould be first Instruction.......
    }

    public static void main(String[] args) {
        third obj = new third(0);
    }
}