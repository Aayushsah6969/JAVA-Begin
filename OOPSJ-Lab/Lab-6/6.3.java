import java.util.Scanner;

class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }   
}
class main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a number: ");
        int n = sc.nextInt();
        try{
            ProcessInput(n);
        }catch(NegativeNumberException e){
            System.out.println("Exception: "+e);
        }finally{
            sc.close();
        }
    }
    public static void ProcessInput(int n) throws NegativeNumberException {
        if(n < 0 || n == 0){
            throw new NegativeNumberException("Number should be positive non-zero");
        }else{
            System.out.println("Double value: "+(n*2));
        }
    }
}