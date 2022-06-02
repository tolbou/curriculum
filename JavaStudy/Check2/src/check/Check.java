package check;

import constants.Constants;

public class Check {

	private static String firstName = "カバタ";
	private static String lastName = "リュウマ";

	private void printName(String firstName, String lastName) {
		Check.firstName = firstName;
		Check.lastName = lastName;

	}

	public static void main(String[] args) {

		String fullName = firstName + lastName;

		System.out.println("printNameメソッド → " + Check.firstName);

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();

	}

}
