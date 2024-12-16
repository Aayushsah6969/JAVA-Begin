
class largest_among_3num {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if(a>b && a>c){
            System.out.println(a +" is the greatest");
        }else if(b>a && b>c){
            System.out.println(b +" is the greatest");
        }else{
            System.out.println(c +" is the greatest");
        }

    }
}
