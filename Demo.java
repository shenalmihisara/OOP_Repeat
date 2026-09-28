/*class Car{
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
}*/

//===============Attribute & Methode=================
/*class Car{
	String brand;
	String colour;
	
	void drive(){
		System.out.println("car is driving");
	}
	
	void brake(){
		System.out.println("car is breaking");
	}
}

class Demo{
	public static void main(String[] args){
		Car c1 = new Car();
		
		System.out.println(c1);
		
		c1.brand = "Toyota";
		c1.colour = "Black";
		
		System.out.println(c1.brand);
		System.out.println(c1.colour);
		
		c1.drive();
		c1.brake();
	}
}*/

//==========================activity===================

/*class Student{
	int id;
	String name;
	int age;
	
	void printDetails(){
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
	}
}

class Demo{
	public static void main(String[] args){
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.id = 1001;
		student1.name = "Shenal";
		student1.age = 19;
		
		student2.id = 1002;
		student2.name = "Sithum";
		student2.age = 22;
		
		student1.printDetails();
		System.out.println("");
		student2.printDetails();
	}
}*/


class Student{
		String name; 
		
		static void print(Student student){
			student.name = "shenal";
			System.out.println(student.name);
		}
	}

class Demo{
	public static void main(String[] args){
		Student student1 = new Student();
		Student student2 = new Student();
		
		student1.print(student1);
		student1.print(student2);
		
		System.out.println(student1.name = "shenal");
		System.out.println(student2.name = "sithum");
		//System.out.println(Student.name = "nisal");
	}
}
