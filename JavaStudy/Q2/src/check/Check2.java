
package check;

public class Check2 {

	private String firstName;
	private String lastName;

	public Check2(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	protected String getFirstName() {
		return firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	// Q4 名前で出力結果の異なるメソッドage()を作成すること
// （①田中太郎の場合に表示するもの：田中太郎は24歳 ②山田花子の場合に表示するもの：山田花子は29歳 ③それ以外の場合：値は無効です）

	 void age(String tanaka, String yamada) {
		if (tanaka.equals("田中太郎")) {
			String message1 =(tanaka + "24歳");
			System.out.println(message1);
		} else if (yamada.equals("山田花子")) {
			String message2 =(tanaka + "29歳");
			System.out.println(message2);
		} else {
			String message3 =("値は無効です");
			System.out.println(message3);
		}

	}

	// Q8 名前が１文字づつ表示されるメソッドnameOne()を作成すること
	void nameOne(String test1) {
		for (int i = 0; i < test1.length(); i++) {
			System.out.println(test1.charAt(i));
		}
	}

}
