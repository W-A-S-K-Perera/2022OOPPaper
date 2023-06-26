package quetion4;

public class ToyotaCar implements Car {
	
	CarAirBag airbag;
	
	

	public ToyotaCar(CarAirBag airbag) {
		super();
		this.airbag = airbag;
	}

	@Override
	public void assembleLight() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for toyota");
		airbag.airBAgLightIndecator();

	}

	@Override
	public void assembleMonitorSystem() {
		// TODO Auto-generated method stub
		System.out.println("Assembling for toyota");
		airbag.airBagMotionDetection();

	}

}
