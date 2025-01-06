import java.util.*;
class overload{
int l,b;
overload(){
	l=0; b=0;	
	}
	
	overload(int x, int y){
		l=x;
		b=y;
		int area = l*b;
		System.out.println("Area of rectangle ="+area);

	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int l = sc.nextInt();
		System.out.println("Enter breadth: ");
		int b = sc.nextInt();
		overload obj1 = new overload(l,b);
		// obj1.overload(6,7);
		// overload obj1 = new overload(6,7);
	}
}