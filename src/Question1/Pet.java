package Question1;

public abstract class Pet implements PointAllocator {
	
	private double points;

	@Override
	public void stter(double points) {
		// TODO Auto-generated method stub
		this.points=points;

	}

	@Override
	public double getters() {
		// TODO Auto-generated method stub
		return this.points;
	}
	
	public abstract void feed();
	public abstract void clean();
	public abstract void cuddle();
	public abstract void GetTotalPoints();

}
