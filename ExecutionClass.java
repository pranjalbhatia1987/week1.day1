package Week3Day1;

public class ExecutionClass {

	public static void main(String[] args) {
		
		Audi a = new Audi();
		a.accerelate();
		a.closeDoor();
		a.shiftGear();
		
		BMW b = new BMW();
		b.enableAirBag();
		b.applyBrake();
		b.shiftGear();
	
		Mahindra m = new Mahindra();
		m.NocloseDoor();
		
		System.out.println(b.wheelCar);
		
		
	

	}

}
