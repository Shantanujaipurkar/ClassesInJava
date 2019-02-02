package ClassesInJava;

public class Car {
	
	
	private int doors;
	private int wheels;
	private String modle;
	private String engine;
	private String carname;
	
	
	public void setCarname(String carname) {
		
		String validation=carname.toLowerCase();
		if(validation.equals("bmw")|| validation.equals("audi"));{
		
		this.carname=carname;
		System.out.println("your car name is " +carname);
		
	}
}
	public String getCarname(String carname) {
		
		return this.carname=carname;
	}
	
	
	
	
}