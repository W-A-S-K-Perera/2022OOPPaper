package Question1;

public class Parrot extends Pet {
	
	private String command;
	

	public Parrot(String command) {
		super();
		this.command = command;
	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub
		System.out.println("feeding the squrriel");
		stter(getters() +5);

	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("cleaning the squrriel");
		stter(getters() +10);

	}

	@Override
	public void cuddle() {
		// TODO Auto-generated method stub
		System.out.println("cuudling the squirrel");
		// TODO Auto-generated method stub
		stter(getters() + 15);

	}

	@Override
	public void GetTotalPoints() {
		// TODO Auto-generated method stub
		if(isCaught() == true) {
			stter(0);
		}else {
			System.out.println("total point is:" + getters());
		}

	}
	public boolean isCaught() {
		try {
			if(this.command.length() ==4 && this.command.equalsIgnoreCase("Walk")) {
				throw new CaughtException("Caught");
			}
			else {
				System.out.println("Not Caught");
			}
			
		}catch(CaughtException e) {
			System.out.println(e);
		}
		return false;
	}

}
