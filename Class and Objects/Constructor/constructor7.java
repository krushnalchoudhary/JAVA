class Project{
    String projectname = "OnlineEdu";
    int no_of_Emp = 20;

    void ClientInfo(){
        String ClientName = "Core2Web";
        System.out.println(ClientName);
        System.out.println(projectname);
        System.out.println(no_of_Emp);
    }
}

class C2W {
    public static void main(String[] args) {
        Project pjt = new Project();
        pjt.ClientInfo();
    }
}
