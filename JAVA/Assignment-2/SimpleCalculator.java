class SimpleCalculator{
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		
		int num2 = Integer.parseInt(args[2]);
		char operator = args[1].charAt(0);
		switch(operator){
		case '+': int sum = num1+num2;
					System.out.println(num1+"+"+num2+"="+sum);
					break;
		case '-': int sub = num1-num2;
				System.out.println(num1+"-"+num2+"="+sub);
					break;
		case '*':int product = num1*num2;
				System.out.println(num1+"*"+num2+"="+product);
					break;
		case '/':int division = num1/num2;
				System.out.println(num1+"/"+num2+"="+division);
					break;
		default: System.out.println("Invalid Operator");
		}
	}
}