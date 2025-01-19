interface drawable{
	void draw();
	default void message(){
	System.out.println("Default message");
	}
	class rectangle implements drawable{
		public void draw(){
			System.out.println("Drawing rectangle");
		}
	}

}
class MainClass{
	public static void main(String ar[]){
		drawable d = new drawable.rectangle();
		d.draw();
		d.message();
	}
}