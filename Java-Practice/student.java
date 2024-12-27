class about {
    String name;
    String email;
    public void details(){
        System.out.println(name+" "+email);
    }
}

public class student{
    public static void main(String args[]){
        about s1 = new about();
        s1.name = "Aayush";
        s1.email = "aayush@gmail.com";
        s1.details();

        about s2 = new about();
        s2.name = "soham";
        s2.email = "hathi@gmail.com";
        s2.details();
    }
}
