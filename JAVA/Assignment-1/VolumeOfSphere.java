class VolumeOfSphere{
	public static void main(String[] args) {
		double  radius = Double.parseDouble(args[0]);
		double volume = (4.0/3.0)*3.14*radius*radius*radius;
		System.out.println("The Volume of Sphere :"+volume);
	}
}