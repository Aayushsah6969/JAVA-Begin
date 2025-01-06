class A{
	void show(){
		System.out.println("I am parent class");
	}
}
class B extends A{
	void show(){
		System.out.println("I am child class");
	}
}
// class B extends A {
//     void show() {
//         super.show(); // Calls the parent class's show method
//         System.out.println("I am child class");
//     }
// }

class main{
	public static void main(String args[]){
		B ob = new B();
		ob.show();
		ob.show();
	}
}