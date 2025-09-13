class Pattern3{
	public static void main(String[] args) {
		int spaces = 20;
		for(int i=1;i<=10;i++){
				System.out.println();
			for(int s=0;s<=spaces;s++)
				System.out.print(" ");
			for(int j=1;j<=i;j++){
				System.out.print(" *  ");
			}
			spaces-=2;
		}
		System.out.println();
	}
}