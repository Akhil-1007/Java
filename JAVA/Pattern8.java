class Pattern8{
	public static void main(String[] args) {
        int n = 5; // Size of diamond
        
        
        for(int i = 1; i <= n; i++) {
            
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            
            for(int j = 1; j <= (2 * i - 1); j++) {
                if(j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      
        for(int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            
            for(int j = 1; j <= (2 * i - 1); j++) {
                if(j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
