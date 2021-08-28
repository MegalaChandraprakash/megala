package week3.day2;

public class Execution extends Desktop {

	


	public void hardwareResources(String name, int memory) {
     System.out.println("model name is dell,  memory is 128gp");
		
	}

	public void softwareResources(String name1, int memory1) {
		System.out.println("model name is hp,  memory is 158gp");
		
	}

	@Override
	public void ScreenModel() {
		System.out.println("ScreenModel TouchScreen");
		
	}

	@Override
	public void ScreenSize() {
		System.out.println("ScreenSize is 28");
		
	}

	public static void main(String[]args) {
		Execution obj = new Execution();
		obj.hardwareResources("dell", 128);
		obj.softwareResources("hp", 158);
		obj.ScreenModel();
		obj.ScreenSize();
		
	}
}
