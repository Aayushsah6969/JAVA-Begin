//NegativeArraySizeException
class E10
{
public static void main(String ar[])
{
try
{
int a[]=new int[-8];
System.out.println("Value="+a[0]);
}
catch(NegativeArraySizeException e)
{
System.out.println(e);
}
}
}
