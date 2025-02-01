//user-defined exception or custom exception
class NegativeFactException extends Exception{}
class main{
    void fact(int p) throws NegativeFactException{
        int f=1;
        if(p>=0){
            for(int i=1; i<=p; i++){
                f=f*i;
            }
            System.out.println("Factorial = "+f);
        }else{
            throw new NegativeFactException();
        }
    } 
public static void main(String ar[]){
    main ob = new main();
    try{
        ob.fact(5);
    }catch(NegativeFactException e){
        System.out.print(e);
    }
}
}