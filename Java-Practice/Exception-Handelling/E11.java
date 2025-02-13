//NumberFormatException
class E11
{
public static void main(String ar[])
{
try
{
int a=Integer.parseInt(ar[0]);
System.out.println("Value="+a);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
}
