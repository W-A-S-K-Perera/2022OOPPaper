package quetion4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarAirBag fAirbag = new FrontAirBag();
		CarAirBag sAirbag = new SideAirBAg();
		
		new NissanCar(fAirbag).assembleLight();
		new NissanCar(fAirbag).assembleMonitorSystem();
		new NissanCar(sAirbag).assembleMonitorSystem();
		
		new ToyotaCar(fAirbag).assembleLight();
		new ToyotaCar(fAirbag).assembleMonitorSystem();
		new ToyotaCar(sAirbag).assembleLight();
		new ToyotaCar(sAirbag).assembleMonitorSystem();

	}

}
