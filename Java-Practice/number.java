import java.util.*;
public class number {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int  a = num.nextInt();
        if(a<0){
            System.out.println("Negative");
        }else if(a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
    }

}
