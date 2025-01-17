import java.util.*;

class plate{
	int l,b;
	plate(int x, int y){
		l=x; b=y;
	}
	void dimension(){
		System.out.println("Dimension of Plate ="+(l*b)+"square unit");
	}
}

class box extends plate{
	int h;
	box(int x, int y, int z){
		super(x,y); h=z;
	}
	void dimension(){
		System.out.println("Dimension of Box ="+(l*b*h)+"Cubic unit");
	}
}

class woodBox extends box{
	int w;
	woodBox(int wi,int x, int y, int z){
		
		super(x,y,z); w=wi;
	}
	void dimension(){
		System.out.println("Dimension of woodBox ="+(l*b*h*w));
	}

}

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		System.out.println("1. for plate");
		System.out.println("2. for box");
		System.out.println("3. for woodBox");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			System.out.println("Enter breadth: ");
			int b = sc.nextInt();
			plate ob = new plate(l,b);
			ob.dimension();
			break;
		case 2:
			System.out.println("Enter length: ");
			int le = sc.nextInt();
			System.out.println("Enter breadth: ");
			int be = sc.nextInt();
			System.out.println("Enter height: ");
			int he = sc.nextInt();
			box obj = new box(le,be,he);
			obj.dimension();
			break;
		case 3:
			System.out.println("Enter length: ");
			int lee = sc.nextInt();
			System.out.println("Enter breadth: ");
			int bee = sc.nextInt();
			System.out.println("Enter height: ");
			int hee = sc.nextInt();
			System.out.println("Enter width: ");
			int wee = sc.nextInt();
			woodBox objs = new woodBox(lee,bee,hee,wee);
			objs.dimension();
			break;


		}
	}
}