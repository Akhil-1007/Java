class Practice{
	public static void main(String[] args) {
		char operator = args[0].charAt(0);
		switch(operator){
		case '+':System.out.println("sum");
				break;
		case '*':System.out.println("product");
				break;
		case '-':System.out.println("sub");
				break;
		case '/':System.out.println("division");
				break;
		}
	}
}