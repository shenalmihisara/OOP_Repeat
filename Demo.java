class Car{
	String brand;
	String colour;
	
	void driver(){
		System.out.println("car is driving");
	}
}
class Demo{
	public static void main(String[]  args){
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.brand = "toyota";
		c1.colour = "red";
		
		System.out.println(c1.brand);
		System.out.println(c1.colour);
		
		c1.driver();

		c1.brand = "BMW";
		c1.colour = "Black";
		
		System.out.println(c1.brand);
		System.out.println(c1.colour);
		
		c1.driver();
	}	
}


