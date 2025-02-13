//throws keyword is not mandatory for unchecked exception
class E13
{
void show(int p)
{
int f=10/p;
System.out.println("Value of f="+f);
}
public static void main(String ar[])
{
E13 ob=new E13();
try
{
ob.show(0);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
