import java.util.*;
class shapes{
	void area(int l){
		int res1 = l*l;
		System.out.println("Area of square ="+res1);
	}
	void area(double r){
		double res2 = 3.14*r*r;
		System.out.println("Area of circle ="+res2);
	}
	void area(float b, float h){
		float res3 = (b*h)/2;
		System.out.println("Area of triangle ="+res3);
	}
	public static void main(String args[]){
		shapes obj = new shapes();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1-square, 2-circle, 3-trianlge");
		int choice=sc.nextInt();
		if(choice == 1){
			System.out.println("Enter length: ");
			int len = sc.nextInt();
			obj.area(len);
		}else if(choice == 3){
			System.out.println("Enter base: ");
			float bas = sc.nextFloat();
			System.out.println("Enter height: ");
			float hei = sc.nextFloat();
			obj.area(bas,hei);
		}
		else if(choice == 2){
			System.out.println("Enter radius: ");
			double rad = sc.nextDouble();
			obj.area(rad);
		}else{
			System.out.println("Invalid choice");
			// return 0;
		}

	}
}