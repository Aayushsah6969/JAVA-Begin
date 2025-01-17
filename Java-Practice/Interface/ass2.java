//1 class extends 1 class and implements multiple interfaces
interface book{
	void title();
} 
interface copy{
	int p=5;
	void price();
}
class material{
	void pen(){
		System.out.println("This is a class pen");
	}
}
class all extends material implements book, copy{
	public void title(){
		System.out.println("This is a Book Title");
	}
	public void price(){
		System.out.println("Price of copy ="+(p*10));
	}
}
class main{
	public static void main(String ar[]){
		all obj = new all();
		obj.pen();
		obj.title();
		obj.price();
			}
}