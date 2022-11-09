package hero;

public class Hero {
	
//	属性の定義
	String name;  //名前の宣言　　　
	
	int hp;  //HPの宣言
	
//	操作の定義
	public void attack() {
		
	};
	
	public void sleep() {  //sleepメソッド
		
		this.hp = 100;  //自分自身のフィールド this:自分自身のインスタンスを意味する
		
		System.out.println(this.name + "は、眠って回復した！"); 
		
	};
	
	public void sit(int sec) 	{  //sitメソッド //何秒座るか引数で受け取る
		
		this.hp += sec;  //座る秒数だけhpを回復する
		
		System.out.println(this.name + "は" + sec + "秒座った！" );
		
		System.out.println("HPが" + sec + "ポイント回復した");
		
	};
	
	public void slip() {  //slipメソッド
		
		this.hp -= 5;
		
		System.out.println(this.name + "は,転んだ！");
		
		System.out.println("5のダメージ！");
		
	};
	
	public void run() {  //runメソッド
		
		System.out.println(this.name + "は、逃げだした！");
		
		System.out.println("GAMEOVER");
		
		System.out.println("最終HPは" + this.hp + "でした");
		
	};
	
	
	
	
	 
	

}
