package comment;

public class Kouhan {
	public static void callDeae() {
		System.out.println("えぇい、このこしゃくな。くせ者だ！であえい！");
	}
	
	public static void showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう！");
		System.out.println("この紋所が目に入らぬか！");
		Thread.sleep(3000); //プログラムを一時的に止めるメソッド。(今回は3秒間)
		Zenhan.doTogame();  //	もう一度、とがめる
	}
}