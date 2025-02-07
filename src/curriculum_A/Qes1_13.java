package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// 問１～３-----------------------------------

		byte firstByte = 0;// バイト型の初期値

		short firstShort = 0;// 短整数型の初期値

		int firstInt = 0;// 整数型の初期値

		long firstLong = 0L;// 長整数型の初期値

		float firstFloat = 0.0f;// 単精度浮動小数点型の初期値

		double firstDoble = 0.0d;// 倍精度浮動小数点型の初期値

		char firstChar = 0;// 文字型の初期値

		String firstString = null;// 文字列型の初期値

		boolean trueth = false;// ブーリアン型の初期値

		byte byteNumber = 10;// バイト型
		System.out.println(byteNumber);

		short shortNumber = 100;// 短整数型
		System.out.println(shortNumber);

		int intNumber = 1000; // 整数型
		System.out.println(intNumber);

		long longNumber = 10000;// 長整数型
		System.out.println(longNumber);

		float floatNumber = (float) 9.5;// 単精度浮動小数点型
		System.out.println(floatNumber);

		double doubleNumber = 10.5;// 倍精度浮動小数点型
		System.out.println(doubleNumber);

		char charNumber = 'a';// 文字型
		System.out.println(charNumber);

		String stringNumber = "ハロー";//文字列型 
		System.out.println(stringNumber);

		boolean booleanWord;// ブーリアン型
		booleanWord = true;
		System.out.println(booleanWord);

		// ---------------------------------------------

		// 問４----------------------------------------------------------

		long manyNumber = byteNumber + shortNumber + intNumber + longNumber;// 長整数型での和算
		System.out.println(manyNumber);

		byte byNumber = (byte) (byteNumber + byteNumber);// 短整数型での和算
		System.out.println(byNumber);

		char name = 'a';
		String name2 = "ハロー";
		boolean is;
		is = true;

		// 文字型と文字列型とブーリアン型との同時出力

		System.out.println(name + name2 + is);

		long lo = (long) (byteNumber + shortNumber + intNumber + longNumber + floatNumber + doubleNumber);// 長整数型での和算
		System.out.println((int) lo);

		double na = doubleNumber / shortNumber;// 倍精度浮動小数点型での除算
		System.out.println(na);

		int nu = byteNumber - shortNumber;// 整数型での減算
		System.out.println(nu);

		// -----------------------------------------------------------------

		// 問５---------------------------------------------

		byte num = 20;// 文字列型ではなくバイト型にすることで和算されての出力に変わる
		byte num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		// -------------------------------------------------

		// 問６--------------------------------------------

		String name3 = "山田太郎";// 名前
		byte age = 18;// 年齢
		double height = 170.5;// 身長
		float weight = (float) 62.2;// 体重
		String favoriteFood = "寿司";// 好きな食べ物

		//--------------------------------------------------

		// 問８（問６に再代入）------------------------------------------------

		name3 = "鈴木一郎";// 名前の再代入
		age = 24;// 年齢の再代入
		height = 168.5;// 身長の再代入
		weight = (float) 64.2;// 体重の再代入
		favoriteFood = "オムライス";// 好きな食べ物の再代入

		System.out.println("初めまして" + name3 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + favoriteFood + "です。");

		/*
		 * 下記はBMIの計算式（変数のみの計算式）
		 */
		double height2 = height / shortNumber;
		double bmi = weight / (height2 * height2);

		System.out.println("bmiは" + String.format("%.1f", bmi) + "です。");

		// ---------------------------------------------------------------------

		// 問１０（問８に対するブーリアン型）---------------------------------------------

		boolean isOverTwentyage;// ２５歳以上ならtrueとなるブーリアン型
		int yourAge = age;

		isOverTwentyage = (yourAge >= 25);

		System.out.println(isOverTwentyage);

		//---------------------------------------------------------------------------------

		// 問１１（問８に対しての文字列型への交換）-------------------------------------

		String text = String.valueOf(age);// 年齢の文字列型への交換
		String text2 = String.valueOf(height);// 身長の文字列型への交換
		String text3 = String.valueOf(weight);// 体重の文字列型への交換

		System.out.println(("年齢=" + text) + ("身長=" + text2) + ("体重=" + text3));

		// -----------------------------------------------------------------------------
		
		
		// 問１２(問１１に対して整数型への交換）-------------------

	    long numbe = Long.parseLong(text);
		int number = (int) numbe;

		System.out.println(number);

		double number2 = Double.parseDouble(text2);
		int number3 = (int) number2;

		/**
		 *  整数型に交換させるために倍精度浮動小数点型へ先に交換
		 */

		System.out.println(number3);

		// --------------------------------------------------------
		
		
		// 問１３(問１２に対するブーリアン型）-------------------------------------

		boolean docchika;
		long age3 = number;
		int height3 = number3;

		docchika = (age3 == 25 || height3 >= 160);// 左辺もしくは右辺のどちらかが該当するか判断するための書式
		System.out.println(docchika);

		// --------------------------------------------

		// 問９-----------------------------------------------------------------

		age += age;// 問８の年齢に対して自己代入
		height += height;// 問８の身長に対して自己代入
		weight += weight;// 問８の体重に対しての自己代入

		System.out.println("初めまして" + name3 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + favoriteFood + "です。");
		
		/**
		 * 下記は問９のBMIの計算式（変数のみの計算式）
		 */

		double heighta = height / shortNumber;
		double bmia = weight / (heighta * heighta);

		System.out.println("bmiは" + String.format("%.2f", bmia) + "です。");




	}

}
