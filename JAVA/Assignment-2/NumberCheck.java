class NumberCheck{
	public static void main(String[] args) {
		int  number = Integer.parseInt(args[0]);
		if(number == 0){
			System.out.println("The number you entered is Zero");
		}
		else{
			if(number > 0){
				System.out.println("The Number you entered is positive");
			}else{
				System.out.println("The number you entered is negative");
			}
		}

	}
}