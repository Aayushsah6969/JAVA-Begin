import java.util.*;
class overload{
int l,b;

	overload(int x, int y){
		l=x;
		b=y;
	}
	overload(){
		int area = l*b;
		System.out.println("Area of rectangle ="+area);
	}
	
	public static void main(String args[]){
		overload obj1 = new overload(6,7);
		// obj1.overload(6,7);
		// overload obj1 = new overload(6,7);
	}
}