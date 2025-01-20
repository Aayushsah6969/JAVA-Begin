import pack.Addition;
import pack.Subtract;
import pack.subpack.Multiplication;
class p1{
    public static void main(String[] args){
        Addition obj = new Addition();
        obj.add(10, 20);
        Subtract.sub(20, 10);
        Multiplication.mul(4,5);
    }
}