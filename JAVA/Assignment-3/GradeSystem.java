class GradeSystem{
	public static void main(String[] args) {
		int percentage = Integer.parseInt(args[0]);
		if(percentage>=0 && percentage<=100){
			if(percentage>=90){
				System.out.println("A Grade");
			}else if(percentage>=80 && percentage<=89){
				System.out.println("B Grade");
			}else if(percentage >=70 && percentage <=79){
				System.out.println("C Grade ");
			}else if(percentage>=60 && percentage <=69){
				System.out.println("D Grade");
			}else{
				System.out.println("F Grade");
			}
		}else{
			System.out.println("Enter valid Percentage");
		}
		
	}
}