class TrafficLight{
	public static void main(String[] args) {
		char Signal = args[0].charAt(0);
		switch(Signal){
		case 'G':System.out.println("Green");
				break;
		case 'Y': System.out.println("Wait");
				break;
		case 'R':System.out.println("Stop");
				break;
		default : System.out.println("Invalid Input");
				break;
		}

	}
}