package hw2;

public class Homework2_6 {

	public static void main(String[] args) {
		System.out.println("==========第六題==========");
//		System.out.println("雙層for回圈，for回圈的變數可以給另一個for回圈當上下限設計一隻Java程式，輸出結果為以下：\n"
//				+ "	1 2 3 4 5 6 7 8 9 10\n"
//				+ "	1 2 3 4 5 6 7 8 9\n"
//				+ "	1 2 3 4 5 6 7 8\n"
//				+ "	1 2 3 4 5 6 7\n"
//				+ "	1 2 3 4 5 6\n"
//				+ "	1 2 3 4 5\n"
//				+ "	1 2 3 4\n"
//				+ "	1 2 3\n"
//				+ "	1 2\n"
//				+ " 1 \n");

		for (int i = 10; i >= 0; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.print("\n");
		}
	}

}
