package 勉強かい;

public class sample {

	  public static void main(String[] args) {

	    // ①「JAPAN」「AMERICA」「KOREA」を要素の値（初期化）とする配列 country を作成
		  String country[] = {"JAPAN", "AMERICA", "KOREA"}; 
	    // ②　①で作成した配列の要素数を出力してください
		  System.out.println(country.length);

	    /* ③下記の値を保持した、方素数3のStringkクラスの配列strArrayを作成してください
	     *   1番目（先頭）の要素に「焼肉」を代入
	     *   2番目の要素に「オムライス」を代入
	     *   3番目の要素に「カツ丼」を代入
	     */
		  String strArray[] = {"焼肉", "オムライス", "カツ丼"};

	    // ④　③で作成した配列の2番目の要素を出力してください
		  System.out.println(strArray[1]);

	    // ⑤下記の処理について、何をしているかコメント記入してください
	    int[] intArray = {30, 40, 50, 60, 70};
	    
//	    intArrayに30,40,50,60,70の5つの要素の値で初期化する

	    // ⑥下記の処理について、何をしているかコメントを記入してください
	    System.out.println(intArray[0] + intArray[4]);
	    
//	    intArrayのインデックス番号０番の値と４番の値を表示させる
	  }
	}