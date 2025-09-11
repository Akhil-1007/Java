class EvenOrOdd{
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		if(number%2==0){
			System.out.println(number+" is a Even number");
		}else{
			System.out.println(number+" is a Odd number");
		}
	}
}