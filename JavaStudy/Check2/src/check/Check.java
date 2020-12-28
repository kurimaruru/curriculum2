package check;

import constants.Constants;

public class Check {

	private static String firstName = "栗原";
	private static String lastName = "陸";

	private static String printName() {
		return firstName + lastName;
	}


	public static void main(String[] args) {
		System.out.println("printNameメソッド → "+printName());
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
	}
}
