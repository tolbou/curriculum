package model;

/**
 * 学生情報クラス
 */
public class Student {

	private String studentNumber; // 学生番号
	private String studentName; // 学生名

	/**
	 * コンストラクタ
	 * @param studentNumber 学生番号
	 * @param studentName 学生名
	 */
	public Student(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}

	/**
	 * 学生番号を返します
	 * @return studentNumber 学生番号
	 */
	public String getStudentNumber() {
		return studentNumber;
	}
	/**
	 * 学生番号をセットします
	 * @param studentNumber セットする studentNumber
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	/**
	 * 学生名を返します
	 * @return studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * 学生名をセットします
	 * @param studentName セットする studentName
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}