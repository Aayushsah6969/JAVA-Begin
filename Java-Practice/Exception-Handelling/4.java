class main{
    public static void  main(String ar[]){
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}