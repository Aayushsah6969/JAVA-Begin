class setbit{
	public static void main(String args[]){
		int n =5;
		int pos = 1;
		int mask = 1<<pos;
		int newNum = mask | n;
		System.out.println("New Number = "+newNum);
	}
}