import java.util.*;
class Compound_Interest{
	public static void main(String[] args) {
		double principle_amount = Double.parseDouble(args[0]);
		double rate_of_interest = Double.parseDouble(args[1]);
		double time_in_years = Double.parseDouble(args[2]);
		double n = 1;
		double amount = principle_amount*Math.pow((1+(rate_of_interest/100)),(n*time_in_years));
		double compound_interest = amount - principle_amount;
		System.out.println("amount :"+ amount + "  compound_interest : "+compound_interest);
	}
}