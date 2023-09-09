package hw2;

public class Homework2_4 {

	public static void main(String[] args) {
		System.out.println("==========第四題==========");
		System.out.println("設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100）");
		for (int i = 1;i<=10;i++) {
			System.out.print((int)Math.pow(i, 2) + " ");
		}
	}
}
