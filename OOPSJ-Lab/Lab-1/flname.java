import java.util.*;

class flname {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fa = in.nextLine();
        System.out.println("Enter your last name");
        String la = in.nextLine();
        System.out.println(la + " " + fa);
    }
}