package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {

		// 問１～３-----------------------------------

		byte a = 10;// バイト型
		System.out.println(a);

		short b = 100;// 短整数型
		System.out.println(b);

		int c = 1000; // 整数型
		System.out.println(c);

		long d = 10000;// 長整数型
		System.out.println(d);

		float e = (float) 9.5;// 単精度浮動小数点型
		System.out.println(e);

		double f = 10.5;// 倍精度浮動小数点型
		System.out.println(f);

		char g = 'a';// 文字型
		System.out.println(g);

		String h = "ハロー";//文字列型 
		System.out.println(h);

		boolean kk;// ブーリアン型
		kk = true;
		System.out.println(kk);

		// ---------------------------------------------

		// 問４----------------------------------------------------------

		long j = a + b + c + d;// 長整数型での和算
		System.out.println(j);

		byte i = (byte) (a + a);// 短整数型での和算
		System.out.println(i);

		char name = 'a';
		String name2 = "ハロー";
		boolean is;
		is = true;

		// 文字型と文字列型とブーリアン型との同時出力

		System.out.println(name + name2 + is);

		long lo = (long) (a + b + c + d + e + f);// 長整数型での和算
		System.out.println((int) lo);

		double na = f / b;// 倍精度浮動小数点型での除算
		System.out.println(na);

		int nu = a - b;// 整数型での減算
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

		// 問８～９（問６に再代入、問８に自己代入）

		name3 = "鈴木一郎";// 名前の再代入
		age = 24 + 24;// 年齢の再代入と自己代入
		height = 168.5 + 168.5;// 身長の再代入と自己代入
		weight = (float) ((float) 64.2 + 64.2);// 体重の再代入と自己代入
		favoriteFood = "オムライス";// 好きな食べ物の再代入と自己代入

		System.out.println("初めまして" + name3 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + favoriteFood + "です。");

		/*
		 * 下記はBMIの計算式（変数のみの計算式）
		 */
		double height2 = height / b;
		double bmi = weight / (height2 * height2);

		System.out.println("bmiは" + String.format("%.2f", bmi) + "です。");

		// ---------------------------------------------------------------------

		// 問１０-------------------------------------------------------------------------

		boolean isOverTwentyage;// ２５歳以上ならtrueとなるブーリアン型
		int yourAge = age;

		isOverTwentyage = (yourAge >= 25);

		System.out.println(isOverTwentyage);

		//---------------------------------------------------------------------------------

		// 問１１----------------------------------------------------------------------

		String text = String.valueOf(age);// 年齢の文字列型への交換
		String text2 = String.valueOf(height);// 身長の文字列型への交換
		String text3 = String.valueOf(weight);// 体重の文字列型への交換

		System.out.println(("年齢=" + text) + ("身長=" + text2) + ("体重=" + text3));

		// -----------------------------------------------------------------------------

		// 問１２--------------------------------------------------

		long numbe = Long.parseLong(text);
		int number = (int) numbe;

		System.out.println(number);

		double number2 = Double.parseDouble(text2);
		int number3 = (int) number2;

		// 整数型に交換させるために倍精度浮動小数点型へ先に交換

		System.out.println(number3);

		// --------------------------------------------------------

		// 問１３-------------------------------------

		boolean docchika;
		long age3 = number;
		int height3 = number3;

		docchika = (age3 == 25 || height3 >= 160);// 左辺もしくは右辺のどちらかが該当するか判断するための書式
		System.out.println(docchika);

		// --------------------------------------------

	}

}
