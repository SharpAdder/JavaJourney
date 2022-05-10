
public class FirstClass {

	public static void main(String[] args) {
	
		//CASTING
	
		//cast string to int
		int stringToInt = Integer.parseInt("1");
		
		//Cast string to double
		double stringToDouble = Double.parseDouble("1.1");
		
		//printing values and type of values
		//System.out.println(stringToInt);
		
		//cast to Object then call the getClass() method
		System.out.println(stringToInt + " -> " + ((Object)stringToInt).getClass());
		System.out.println(stringToDouble + " -> " + ((Object)stringToDouble).getClass());
		
	
	}
}
