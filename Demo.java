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

/*class Box{
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
}*/

/*class Student{
	Student(){
		System.out.println("Constroctor 1.....");
	}
	
	Student(int id){
		this();
		System.out.println("Constroctor 2....");
	}
}

class Demo{
	public static void main(String[] args){
		Student s1 = new Student(1001);
		
	}
} */

/*class Student{
	int id;
	String name;
	int age;
	
	Student(){
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age + "\n");
	}
	
	Student(int id, String name, int age){
		this();
		this.id = id;
		this.name = name;
		this.age = age;
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
}

class Demo{
	public static void main(String[] args){
		Student s1 = new Student(1001, "Shenal", 19);
	}
}*/

//=======================constroctor chainning=============

/*class student{
	int id;
	String name;
	int age;
	
	student(){
		this(0);
		System.out.println("1");
	}
	
	student(int id){
		this(id,"unknown");
		System.out.println("2");
	}
	
	student(int id,String name){
		this(id,name,0);
		System.out.println("3");
	}
	
	student(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("4");
		

	}
}

class Demo{
	public static void main(String[] args){
		student s1 = new student();
	}
}*/

//==================Encapsulation==========================

/*class Student{
	private Integer age;
	
	public Integer getAge(){
		return age;
	}
	
	public void setAge(Integer age){
		
		if(age >= 0){
			this.age = age;
		}
	}
}

class Demo{
	public static void main(String[] args){
		Student s1 = new Student();
		
		s1.setAge(20);
		
		System.out.println(s1.getAge());
	}
}*/

//=================Activity=====================

/*class BankAccount{
	private int accountNumber;
	private String name;
	private double balance;
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setBallance(double balance){
		this.balance = balance;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBallance(){
		return balance;
	}
}

class Demo{
	public static void main(String[] args){
		BankAccount account = new BankAccount();
		
		account.setAccountNumber(1001);
		account.setName("Shenal");
		account.setBallance(50000);
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBallance());
	}
}*/


/*class Student{
	int id;
	String name = "Shenal";
		
	static String Campus = "icet";
	static final String petName = "Puffy";
	

	static void print(){
		//System.out.println(s1.name);
		System.out.println(petName);
		System.out.println(Campus);
	}
}

class Demo{
	public static void main(String[] args){
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		Student.Campus = "Sliit";
		
		System.out.println(Student.Campus);
		System.out.println(Student.name);
		System.out.println(s1.Campus);
		
		s1.print();
	}
}*/


/*class Student {
    String name;
}

class Demo{
	public static void main(String[] args){
		   Student s1 = null;

	s1.name = "Shenal";

	Student s2 = s1;

	s2.name = "Sithum";

	System.out.println(s1.name);
	System.out.println(s2.name);
	}
}*/


//========================object array=====================

/*class Student{
	String name;
	

}
class Demo{
	public static void main(String[] args){

		Student[] student = new Student[3];
		
		student[0] = new Student();
		student[1] = new Student();
		student[2] = new Student();
		
		student[0].name = "Sithum";
		student[1].name = "Shenal";
		student[2].name = "Nisal";
		
		System.out.println(student[0].name);
		System.out.println(student[1].name);
		System.out.println(student[2].name);
	}
}*/


/*class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}
class Demo{
	public static void main(String[] args){

		Student[] student = new Student[3];
		
		student[0] = new Student(1,"Shenal");
		student[1] = new Student(2,"Sithum");
		student[2] = new Student(3,"Nisal");
		
		student[0].name = "Bihandu";
		
		for(int i=0; i<student.length; i++){
			System.out.println(student[i].name);
			System.out.println(student[i].id);
		}
		
		for(Student students : student){
			System.out.println(students.name);
			System.out.println(students.id);
		}
	}
}*/


/*class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Demo{
	public static void main(String[] args){
		Student[] student = new Student[3];
		
		student[0] = new Student(1001,"Shenal");
		student[1] = new Student(1002,"Sithum");
		student[2] = new Student(1003,"Nisal");
		
		int SearchId = 1002;
		boolean found = false ;
		
		for(int i=0; i<student.length; i++){
			if(student[i] != null && student[i].id == SearchId){
				System.out.println("Student found...");
				System.out.println(student[i].name);
				
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("Student not found");
		}
	}
}*/


class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Demo{
	public static void main(String[] args){
		Student[] student = new Student[3];
		
		student[0] = new Student(1001,"Shenal");
		student[1] = new Student(1002,"Sithum");
		student[2] = new Student(1003,"Nisal");
		
		int SearchId = 1002;
		
		for(int i=0; i<student.length; i++){
			if(student[i] != null && student[i].id == SearchId){
				student[i].name = "Sithum Nimsara";
				System.out.println(student[i].name);
				break;
			}
		}
	}
}
