class A{
	int a;
	A(int x){
		a=x;
	}
	void show(){
		System.out.println(a);
	}
}
class B extends A{
	int a;
	B(int p, int q){
		super(p);
		a=q;
	}
	void display(){
		System.out.println(super.a+" "+a);
	}
}
// class C extends B{
// 	// int a;
// 	void give(){
// 		System.out.println(super.a);
// 	}
// }
class main{
	public static void main(String args[]){
		B obj = new B(12,13);
		obj.show();
		obj.display();
		C ob = new C();
		ob.give();
	}
}