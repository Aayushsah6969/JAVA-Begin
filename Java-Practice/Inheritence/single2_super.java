class A{
	int a,b;
	A(int x, int y){
		a=x;
		b=y;
	}
	void show(){
		System.out.println(a+" "+b);
	}
}
class B extends A{
	int c;
	B(int p, int q, int r){
		super(p,q);
		c=r;
	}
	void display(){
		System.out.println(a+" "+b+" "+c);
	}
}
class main{
	public static void main(String args[]){
		A obj = new A(10, 20);
		obj.show();
		B obj1 = new B(11, 12, 13);
		obj1.display();
		
		
	}
}