//Nested-try
class E16
{
public static void main(String ar[])
{
try
{
int a=Integer.parseInt(ar[0]);
System.out.println("Value="+a);
	try
	{
	int b=10/a;
	System.out.println("Value of b="+b);
	int p[]=new int[10];
	p[90]=45;
	System.out.println(p[90]);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Inner catch: "+e);
	}
}
catch(ArrayIndexOutOfBoundsException g)
{
System.out.println("Outer catch: "+g);
}
}
}
