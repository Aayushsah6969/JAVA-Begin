class fibonacci {
    public static void main(String args[]){
        int n=10,c;
        int a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0; i<n; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }    
}
