package quetion4;

public class NissanCar implements Car {
	
	CarAirBag airbag;
	

	public NissanCar(CarAirBag airbag) {
		super();
		this.airbag = airbag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for nissan");
		airbag.airBAgLightIndecator();

	}

	@Override
	public void assembleMonitorSystem() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for Nissan");
		airbag.airBagMotionDetection();

	}

}
