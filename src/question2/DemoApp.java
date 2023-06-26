 package question2;

public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TCalculations<Integer> integer = new TCalculations<>();
		integer.append(12);
		integer.append(1);
		integer.append(23);
		integer.append(11);
		integer.append(2);
		
		TCalculations<Double> dob = new TCalculations<>();
		
		dob.append(23.1);
		dob.append(45.7);
		dob.append(78.9);
		dob.append(67.9);
		
		System.out.println(integer.average());
		System.out.println("\n"+dob.average());

	}

}
