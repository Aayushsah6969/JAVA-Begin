class A{
	int a=10;
	void show(){
		System.out.println(a);
	}
}
class B extends A{
	int a=20;
	void display(){
		System.out.println(super.a+" "+a);
	}
}
class main{
	public static void main(String args[]){
		B ob = new B();
		// ob.a = 9;
		ob.show();
		ob.display();
	}
}