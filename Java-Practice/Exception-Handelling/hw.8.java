 import java.util.*;
 class divisionException extends Exception{}
 class Main{
    void div(int a, int b) throws divisionException{
        if(a>b){
            int res = a/b;
            System.out.println("Division result = "+res);
        }else{
            throw new divisionException();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int num = sc.nextInt();
        System.out.println("Enter denominator: ");
        int den = sc.nextInt();
        Main obj = new Main();
        try{
            obj.div(num, den);
        }catch(divisionException e){
            System.out.println(e);
        }finally{
            sc.close();
        }
    }
}
