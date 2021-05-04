
public class Byte {

	public static void main(String[] args) {
		byte a=126;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		//its overflows because
		//byte store -128 to 127
		a++;
		System.out.println(a);
		
		//looping back within the range
		a++;
		System.out.println(a);

	}

}
