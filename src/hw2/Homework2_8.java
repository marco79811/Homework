package hw2;

public class Homework2_8 {

	public static void main(String[] args) {
		System.out.println("請分別建立x, y, z三個3x3的int陣列，" + "然後把x和y陣列的加總存放到z陣列裡， 再將結果顯示於螢幕上\n" + "• x和y陣列中的數字:\n"
				+ "• 請用亂數產生介於0~30之間的整數\n" + "• 亂數之取得可參考java.lang.Math的靜態方法random()\n"
				+ "• publicstaticdoublerandom() .傳回亂數值其範圍為0.0~1.0\n");
		// int r1 = (int)(Math.random()*31);)
		int x[][] = new int[3][3], y[][] = new int[3][3], z[][] = new int[3][3];
		// 產生X陣列
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++) {
				x[i][j] = (int) (Math.random() * 31);

				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// 產生y陣列
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y.length; j++) {
				y[i][j] = (int) (Math.random() * 31);

				System.out.print(y[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z.length; j++) {
				z[i][j] = x[i][j] + y[i][j];
//				System.out.println(x[i][j] + "\t" + y[i][j] + "\t" + z[i][j]);
				System.out.println(z[i][j]+" ");
				System.out.println(x[i][j] + "\t" + y[i][j] + "\t" + z[j][j]);
			}
			System.out.println();
		}
	}
}
