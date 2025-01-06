class A {
    void show(){
    	System.out.println("I am parent class");
    }
}
class B extends A {
	void display(){
		System.out.println("I am child class");
	}
	public static void main(String args[]){
		B obj = new B();
		obj.show();
		obj.display();
	}
}
