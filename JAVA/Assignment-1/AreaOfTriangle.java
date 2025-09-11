import java.util.*;
class AreaOfTriangle{
	public static void main(String[] args) {
		
		int side1 = Integer.parseInt(args[0]);
	    int side2 = Integer.parseInt(args[1]);
		int side3 = Integer.parseInt(args[2]);
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.println("Area of Triangle is : "+area);

	}
}