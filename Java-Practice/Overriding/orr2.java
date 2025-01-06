class A{
final	void show(){
		System.out.println("I am parent class");
	}
}
class B extends A{
	void show(){
		System.out.println("I am child class");
	}
}


class main{
	public static void main(String args[]){
		B ob = new B();
		ob.show();
		ob.show();
	}
}