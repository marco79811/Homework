package hw2;

public class Homework2_5 {

	public static void main(String[] args) {
		System.out.println("==========第五題==========");
		System.out.println("1~49個位數或十位數不含4，輸出:可以選擇的數字有哪些？共幾個？");
		int i, count = 0;
		for (i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i > 39) {
				count += 1;
			} else {
				System.out.println(i);
			}
		}
		count = 49 - count;
		System.out.println("阿文能選的數字有共" + count + "個");
	}
}
