//クラス
public class HelloJava {
	
	
	
//	Stringクラスの、messageという名前のフィールド。
	
//	アクセス修飾子が「private」なので、このHelloJavaクラス内でのみ使用可能。
	private String message;
	

	public HelloJava() {
		
		message = "Hello";
		
	}
	
	public void print() {
		
		System.out.println(message);
		
	}

}

