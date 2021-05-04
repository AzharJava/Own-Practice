class operator{
	public static void main(String[] args) {

		Person obj1=new Person();
		Person obj2=new Person();

		//as obj is of type person, it is not an instance of Boy or interface

		System.out.println("obj1 intance of Person: "+(obj1 instanceof Person));
		System.out.println("obj1 instance of Boy: "+(obj1 instanceof Boy));
		System.out.println("obj1 instance of Myinterface: "+(obj1 instanceof MyInterface));

		//Since obj2 is of type boy,
		//whose parent class is person
		//and it implements he ineterface myinterface
		//it is instance of all of these classes

		System.out.println("obj2 instance of Person: "+(obj2 instanceof Person));
		System.out.println("obj2 instance of boy: "+(obj2 instanceof Boy));
		System.out.println("obj2 instance of MyInterface: "+(obj2 instanceof MyInterface));

		
	}
}

class Person{

}

class Boy extends Person implements MyInterface{

}
interface MyInterface{

}