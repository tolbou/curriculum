package test;

public class Sample {
	private String name;

//	セッター
	public void setName(String Name) {
		this.name = Name;
	}

//	ゲッター
	public String getName() {
		System.out.println(this.name);
		return this.name;
	}

}
