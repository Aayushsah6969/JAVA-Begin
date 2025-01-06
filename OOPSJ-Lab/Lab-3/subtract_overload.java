class subtract{
	void calculate(int a, int b){
		int res1 = a-b;
		System.out.println("Result1 = "+ res1);
	}
	void calculate(float c, float d, float e){
		float res2 = ((c+d)-e);
		System.out.println("Result2 = "+res2);
	}
	public static void main(String args[]){
		subtract obj = new subtract();
		obj.calculate(6,5);
		obj.calculate(4.5f, 6.7f, 8.7f);
	}
}