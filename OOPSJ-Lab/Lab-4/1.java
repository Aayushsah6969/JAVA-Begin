import java.util.*;
class twod{
	double length;
	double breadth;
	twod(double x, double y){
		length=x;
		breadth=y;
	}
	void cost(){
		double a = length*breadth;
		double p = a*40;
		System.out.println("Price of 2D = "+p);
	}
}
class threed extends twod{
	double height;
	threed(double length, double breadth, double heighte){
		super(length, breadth);
		height=heighte;
	}
	void cost(){
		double p = length*breadth*height*60;
		System.out.println("Price of 3D = "+p);
	}

}
class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. for 2D");
		System.out.println("2. for 3D");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter length: ");
			double l = sc.nextDouble();
			System.out.println("Enter breadth: ");
			double b = sc.nextDouble();
			twod ob = new twod(l,b);
			ob.cost();
			break;
		case 2:
			System.out.println("Enter length: ");
			double le = sc.nextDouble();
			System.out.println("Enter breadth: ");
			double be = sc.nextDouble();
			System.out.println("Enter height: ");
			double he = sc.nextDouble();
			threed obj = new threed(le,be,he);
			obj.cost();
			break;

		}
	}
}