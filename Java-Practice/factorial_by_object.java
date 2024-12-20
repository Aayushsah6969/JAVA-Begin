class factorial_by_object{
    void factorial(long a){
        long f=1;
        for(long i=1; i<=a; i++){
            f=f*i;
        }
        System.out.println("Result = " + f);
    }
    public static void main(String[] ar){
        factorial_by_object obj = new factorial_by_object();
        long x = Long.parseLong(ar[0]);
        obj.factorial(x);
    }
}