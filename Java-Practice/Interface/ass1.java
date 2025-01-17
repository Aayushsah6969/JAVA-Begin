//1 class implements multiple Interfaces
interface car{
	String model = "Tesla";
	void vehicle();
}
interface Truck{
	String color = "Blue";
	// String model = "Tata"; Not permitted to do 
	void heavy();
}
class machine implements car, Truck{
	public void vehicle(){
		System.out.println("Brand ="+model);
	}
	public void heavy(){
		System.out.println("Brand = "+color);
	}
}

class main{
	public static void main(String arg[]){
		machine ob = new machine();
		ob.vehicle();
		ob.heavy();
	}
}