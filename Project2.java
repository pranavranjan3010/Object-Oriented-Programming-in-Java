package javac12;

public class java2 {

	public static void main(String[] args) //main function
	
	{
		C c=new C();
		c.details();
		
	}
	
	}
//Multiple inheritance...................
class A
{
	A()
	{
		System.out.println("Grand child");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Parent class");
	}
}
class C extends A implements java_12//Multiple Inheritance................
{
	C()
	{
		System.out.println("child class");
	}
	public void details()
	{
		System.out.println("I'm the interface of this class!!");
	}
}
	/*
	{
		student s1=new student();
		
		s1.java_12();//interface method or the virtual Functions calling..................
		s1.details_student();//class method calling..................
	}
	
	}
//Interface - used in the multiple Inheritance................
 class student implements java_12//adding Interface
{
	private String name="Pranav Ranjan";//private member variables...............
	private int roll=57;
	private double  marks=9.37;
	void details_student()//class method.............
	{
		System.out.println("Name-"+name);
		System.out.println("Roll-"+roll);
		System.out.println("Marks-"+marks);
	}
	
	void java_12()
	{
		System.out.println("------------Student Details---------------");
	}

	@Override
	public void details() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
*/
	

	/*
	{
		bank_data b=new bank_data();//object created
		b.data_details();
	}
	}
//Encapsulation- Binding your data with your methods.................
class bank_data
{
	private int cvv_no=168823;//private member variables.......
	private int pin=23445;//private member variables.......
	void data_details()
	{
		System.out.println("Cvv_numver-"+cvv_no);
		System.out.println("Pin_numver-"+pin);
	}
}
*/
	

	/*
	{
		//car c=new car();//We cannot create the object for the abstract class 
		car2 c=new car2();//object created.........
		c.car_data();//method calling..........
	}
}
//Abstraction or Abstract keyword uses..................
abstract class car//Abstract class

{
	 int cost=400000;
	 int speed=200;
	 String color="Red";
	 String name="Ferrari";
	void car_data()//Method.......
	{
		System.out.println("Name-"+name);
		System.out.println("Cost-"+cost);
		System.out.println("Color-"+color);
		System.out.println("Speed-"+speed);
	}
}
class car2 extends car//Inheritance...........
{
	car2()//Constructors.............
	{
		System.out.println("-------------Car details---------------------\n");
	}
}
*/
	
	/*
	{
		child c=new child();//object created................
	}
	
	}
//Inheritance................
class parent//Parent class .......
{
	parent()//Constructor1.......
	{
		System.out.println("I'm the parent class\n");
	}
}
class child extends parent//Inheritance
{
	child()//Constructor2......
	{
		System.out.println("I'm the child class\n");
	}
}
*/
	
	/*
	{
		B b=new B();//child class object..........
		b.data();//method calling..............class class method overrides the parent class method.................
	}
	
	}
//Method overriding...................(Run-time Polymorphism)..........
class A//Parent class............
{
	void data()//parent method ............
	{
		System.out.println("I'm the parent class\n");
	}
}
class B extends A//Child class inherits the parent class......
{
	void data()//child method.........
	{
		System.out.println("I'm the child class\n");
	}
}
*/
	
	/*
	
	{
		add s=new add();
		//s.sum(2, 3);
		//s.sum("hello", "hi");
		//s.sum(2.3,5.6);
		//s.sum(123456,123456);
		System.out.println(s.sum(2,3));
		System.out.println(s.sum("hello", "hi"));
		System.out.println(s.sum(2.4,5.6));
		System.out.println(s.sum(12345,3456));
	}
	
	}
//Function overloading (Polymorphism-Compile time Polymorphism).............
class add
{
//Same method name but different arguments and return type.................
	public int  sum(int a,int b)//Method1.......
	{
		return a+b;
		
	}
	public String  sum(String a,String b)//Method2......
	{
		return a+b;
		
	}
	public double  sum(double a,Double b)//Method3......
	{
		return a+b;
		
	}
	public long  sum(long a,long b)//Method4......
	{
		return a+b;
		
	}
}
*/
	
	/*
	//Static keyword.............
	{
		bike b=new bike();//object created.........
		bike.bike_details();//method calling by class name.........
		//b.bike_details();//method calling by object.....
		
}
}
 class bike//Class name
{
	private static int cost =20000;//Static member variable...........
	private static String name="Hayabusa";//Static member variable..........
	private static String color="Black";//Static member variable..........
	public static void bike_details()//Static method.................
	{
		System.out.println("Name-"+name);
		System.out.println("Color-"+color);
		System.out.println("Cost-"+cost);
	}
	
}
*/
	
 
	/*
	{
		book b=new book();//object created...........
		b.book_data();//Method calling............
	}
	}
  //Access modifiers............
class book
{
	private int id=1234;//private attributes
	private String name="Java Programming";
	private int cost=5000;
	public void book_data()//public method accessible in the main function......
	{
		System.out.println("Name-"+name);
		System.out.println("Id-"+id);
		System.out.println("Cost-"+cost);
	}
}
*/
	
	/*
	{
		A a=new A();
	    a.name="Kim harry";
	    System.out.println("Name-"+a.name);
	}
	
	}
//Parameterized constructors.......

// Parameterized Constructors..........
class A//Class name
{
	String name;
	A(String name)
	{
		this.name=name;
	}
}
*/
	
	/*
	{
	A a=new A();//object created...........
	
    }
   }
//Constructors..........
class A//Class name
{
	A()//Constructor(Default constructor)
	{
		System.out.println("I'm the constructors of the class A");
	}
}
*/
	

	/*
	{
		//class and objects............
		man m=new man();//object or instance of the class......
		m.data();//Function calling.......

	}

}
class man//Class name............
{
   String name="Harry Potter";//Member variables........
   int age=23;//Member variables.........
   String gender="Male";//Member variables..........
   public void data()//Method or Function..........
   {
	   System.out.println("Name-"+name);
	   System.out.println("Age-"+age);
	   System.out.println("Gender-"+gender);
   }
   
}
*/
