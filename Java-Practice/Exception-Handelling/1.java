class main{
    public static void main(String arg[]){
        try{
            int a = 10/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e);
        }
        System.out.println("KIIT");
    }
}