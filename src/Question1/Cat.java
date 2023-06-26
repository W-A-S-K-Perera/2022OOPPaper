package Question1;

public class Cat extends Pet {

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("Feeding the cat");
		stter(getters()+5);

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning the cat");
		stter(getters()+10);

	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("cuddling the cat");
		stter(getters()+15);

	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		System.out.println("Total point is" + getters());

	}

}
