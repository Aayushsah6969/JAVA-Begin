import java.util.*;

class main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int num = sc.nextInt();
        System.out.println("Enter denominator: ");
        int den = sc.nextInt();
         try{
            int res = num/den;
            System.out.println("Division result: "+res);
         }catch(ArithmeticException e){
            System.out.println("Catch block: "+e);
         }finally{
            sc.close();
         }
    }
}