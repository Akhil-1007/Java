class Pattern4{
	public static void main(String[] args) {
		int spaces = 0;
		for(int i=1;i<=10;i++){
			System.out.println();
			for(int s=1;s<=spaces;s++){
				System.out.print(" ");
			}
			for(int j=10;j>=i;j--){
				System.out.print(" *  ");
			}
			spaces+=2;
		}
		System.out.println();
	}
}