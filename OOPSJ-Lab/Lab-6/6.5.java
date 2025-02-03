class CheckArgument extends Exception{}

class Main{
    public static void main(String arg[]){
        try{
            if(arg.length < 4){
                throw new CheckArgument();
            }
            int sum = 0;
            for(int i = 0; i < 4; i++){
                sum += Integer.parseInt(arg[i]) * Integer.parseInt(arg[i]);
            }
            System.out.println(sum);
        }catch(Exception e){
            System.out.println("Exception occurred - CheckArgument");
            System.out.println(e);
        }
    }
}