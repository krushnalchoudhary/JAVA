class IPL {
    void MatchInfo(String team1 , String team2){
        System.out.println(team1 + " VS " + team2);
    }

    void MatchInfo(String team1 , String team2 , String Venue){
        System.out.println(team1 + " VS " + team2);
        System.out.println("Venue = " +Venue);
    }
}

class Client1{
    public static void main(String[] args) {
        IPL ipl2023 = new IPL();
        ipl2023.MatchInfo("GT", "CSK", "NMSA");
        ipl2023.MatchInfo("GT", "CSK");
    }
}