interface drawable{
	public abstract void draw();
	static int cube(int x){
		return x*x*x;
	}
}
class rectangle implements drawable{
	public void draw(){
		System.out.println("Drawing rectangle");
	}
	void display(){
		System.out.println("CSE");
	}
}
class MainClass{
	public static void main(String ar[]){
		rectangle d = new rectangle();
		d.draw();
		d.display();
		int y = drawable.cube(3);
		System.out.println(y);
	}
}