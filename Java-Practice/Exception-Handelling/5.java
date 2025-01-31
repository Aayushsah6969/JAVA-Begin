class main{
    public static void main(String arr[]){
        try{
            throw new ArrayIndexOutOfBoundsException("CSE");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}