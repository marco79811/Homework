package hw2;

public class Homework2_1 {

	public static void main(String[] args) {
		System.out.println("==========第一題==========");
		System.out.println("設計一隻Java程式，計算1～1000的偶數和");
		int sum = 0, i = 0; 
		for (;i<=1000;i+=2) {
			if (i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1~1000的偶數和為："+sum);
		
		
		//		各種迴圈型態練習
//		2.倒三角形練習
//		3.英文字三角形練習(請用迴圈)"
//		講義 P62之課堂練習

	}

}
