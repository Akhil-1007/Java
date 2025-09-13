class Pattern5{
	public static void main(String[] args) {
		int spaces = 30;
		for(int i=1;i<=10;i++){
			System.out.println();
			for(int s=1;s<=spaces;s++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(" *  ");
			}
			spaces-=2;
		}
		spaces=14;
		for(int i=1;i<=9;i++){
			System.out.println();
			for(int s=1;s<=spaces;s++){
				System.out.print(" ");
			}
			for(int j=9;j>=i;j--){
				System.out.print(" *  ");
			}
			spaces+=2;
		}
		System.out.println();
	}
}