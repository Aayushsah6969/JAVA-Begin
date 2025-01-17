class Apple{
	void show(){
		System.out.println("I am Apple");
	}
}
class Banana extends Apple{
	void show(){
		System.out.println("I am Banana");
	}
}
class Cherry extends Apple{
	void show(){
		System.out.println("I am Cherry");
	}
}
class main{
	public static void main(String arg[]){
		Apple ob1 = new Apple();
		Banana ob2 = new Banana();
		Cherry ob3 = new Cherry();

		Apple ref;
		ref = ob1;
		ref.show();
		ref = ob2;
		ref.show();
		ref=ob3;
		ref.show();
	}
}