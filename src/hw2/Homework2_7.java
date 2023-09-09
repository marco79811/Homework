package hw2;

public class Homework2_7 {

	public static void main(String[] args) {
		System.out.println("==========第六題==========");
//		System.out.println(設計一隻Java程式，輸出結果為以下：
//		A		=65
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF		=70);
		// (int)'A'=65 → 也就是說 (char)65 = A，若 i =65 → (char) i = A
		int a = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) a + " ");
			}
			a += 1;
			System.out.print("\n");
		}

	}

}
