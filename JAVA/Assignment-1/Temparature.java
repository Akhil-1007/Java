class Temparature{
	public static void main(String[] args) {
		double celsius_temp=Double.parseDouble(args[0]);
		double fahr=(celsius_temp*9/5)+32;
		System.out.println(fahr);
		
	}
}