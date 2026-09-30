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

//=================static===================

/*class Student{
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
}*/

//====================constructor=========================

/*class Student{
	int id;
	String name;
	int age;
	
	Student(){
		id = 1001;
		name = "Shenal";
		age = 19;
	}
	
	void print(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
class Demo{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 1002;
		s1.name = "sithum";
		s1.age = 22;
		
		s1.print();
		s2.print();
	}
}*/

//=================parametarized constructor===================

/*class Student{
	int id;
	String name;
	int age;
	
	Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void print(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
class Demo{
	public static void main(String[] args){
		Student s1 = new Student(1001,"Shenal",19);
		Student s2 = new Student(1002,"Sithum",22);
		
		s1.print();
		s2.print();
	}
}*/

//================constrocture overloading=====================

/*class Student{
	int id;
	String name;
	int age;
	
	Student(){
		System.out.println("Empty Constrocture....");
	}
	
	Student(int id){
		this.id = id;
	}
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	void print(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}
class Demo{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student(1002);
		Student s3 = new Student(1002,"Sithum");
		Student s4 = new Student(1002,"Sithum",19);
		
		s1.print();
		System.out.println("");
		s2.print();
		System.out.println("");
		s3.print();
		System.out.println("");
		s4.print();
	}
}*/

//=======================activity=========================

class Box{
	int length;
	int width;
	int height;
	
	Box(){
		
	}
	
	Box(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Box(int length){
		this.length = length;
		width = 1;
		height = 1;
	}
	
	void printvolume(){
		System.out.println("Volume : " + length*width*height);
	}
}

class Demo{
	public static void main(String[] args){
		Box b1 = new Box();
		Box b2 = new Box(10,5,3);
		Box b3 = new Box(20);
		
		b1.printvolume();
		System.out.println("");
		b2.printvolume();
		System.out.println("");
		b3.printvolume();
	}
}
