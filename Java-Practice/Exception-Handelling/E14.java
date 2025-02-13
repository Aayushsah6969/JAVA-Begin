//Multiple-catch
class E14
{
public static void main(String ar[])
{
try
{
int a=Integer.parseInt(ar[0]);
System.out.println("Value="+a);
int b=10/a;
System.out.println("Value of b="+b);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
