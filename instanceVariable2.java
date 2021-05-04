class Emp{
	//static variable salary
	public static double salary;
	public static String name="Azhar";

}

class EmpDemo{
	public static void main(String[] args) {
		//accessing static variable without object
		Emp.salary=10000;
		System.out.println(Emp.name+ "' average salary: "+Emp.salary);
	}
}