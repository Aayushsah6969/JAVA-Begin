class getbit{
	public static void main(String args[]){
		int n=6;
		int pos=2;
		int bitMask = 1<<pos;
		System.out.println("BitMask = "+bitMask);
		if((bitMask & n)==0){
			System.out.println("Bit is zero");
		}else{
			System.out.println("Bit is one");
		}
	}
}