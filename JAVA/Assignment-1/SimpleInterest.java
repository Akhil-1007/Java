class SimpleInterest{
	public static void main(String[] args) {
		double p_a = Double.parseDouble(args[0]);
		double time = Double.parseDouble(args[1]);
		double rate_of_interest = Double.parseDouble(args[2]);
		double s_i = (p_a * time * rate_of_interest)/100;
		System.out.println(s_i);
		System.out.println("Total amount:"+(p_a+s_i));
	}
}