 class gcd {
    static int findgcd(int a, int b){
        int i;
        if(a<b){
            i=a;
        }else{
            i=b;
        }
        for(int j=i; j>0; j--){
            if(a % j == 0 && b %j==0){
                return j;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int gcdnum = findgcd(num1, num2);
        System.out.println("gcd = "+gcdnum);
    }    
}
