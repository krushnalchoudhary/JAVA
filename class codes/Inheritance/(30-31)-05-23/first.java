class ICC {
    ICC(){
        System.out.println("In ICC Constructor");
    }
}

class BCCI extends ICC{
    BCCI(){
        System.out.println("In BCCI Construcotr");
    }
}

class Client {
    public static void main(String[] args) {
        BCCI bcci = new BCCI();
    }
}