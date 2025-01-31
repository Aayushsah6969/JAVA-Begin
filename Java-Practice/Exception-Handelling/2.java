class main{
    public static void main(String args[]){
        try{
            int a[] = {2, 5 ,6 ,7, 8,};
            a[100]=34;
            System.out.println("Value at [100] = "+a[100]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}