
class function1{
    static int average(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum/3;
        return avg;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int result = average(a,b,c);
        System.out.println(result);

    }
}