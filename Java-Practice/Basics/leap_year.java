import java.util.*;
public class leap_year {
    public static void main(String[] args){
        Scanner year = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yr = year.nextInt();
        if(yr % 4 == 0){
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}
