package varibaleExample;

public class variableExample {
	
	public void variableAge() {
		//local variable
		int age=10;
		age=age+5;
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		
		variableExample obj=new variableExample();
		obj.variableAge();
	}

}
