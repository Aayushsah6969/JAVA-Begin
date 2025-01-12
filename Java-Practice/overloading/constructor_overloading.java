class constructor_overloading{
	constructor_overloading(){
		System.out.println("Default");
	}
	constructor_overloading(float f, float a){
		System.out.println("Pressure = "+(f/a));
	}
	constructor_overloading(int a, int b){
		System.out.println("Sum = "+(a+b));
	}
	public static void main(String args[]){
		constructor_overloading obj2 = new constructor_overloading(4.5f, 5.7f);
		constructor_overloading obj1 = new constructor_overloading();
		constructor_overloading obj3 = new constructor_overloading(6,7);
	}
}