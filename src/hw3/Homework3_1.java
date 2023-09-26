package hw3;

//import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

class Homework3_1 {
	public static void main(String[] args) {
		{

			/*
			 * 1.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰 三角形、其它三角形或不是三角形,如圖示結果:
			 * (提示:Scanner,三角形成立條件,判斷式if else) (進階功能:加入直角三角形的判斷=>a^2+b^2=c^2)
			 */
			while (true) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("輸入一個數字，以判斷是否為一個三角型，或輸入\"end\"以結束程式");
				double a = sc1.nextDouble();
				double b = sc1.nextDouble();
				double c = sc1.nextDouble();
//			String str = sc1.nextLine();
//			String s1 = "end", s2 = "End", s3 ="eNd", s4="ENd", s5 = "enD", s6="EnD";
				if (a <= 0 || b <= 0 || c <= 0) {
					System.out.println("請輸入非0之正數");
				} else if (a == b && a == c && b == c) {
					System.out.println("正三角形");
				} else if (((a == b) && (b != c && a != c)
						|| ((a == c) && (a != b && b != c) || ((b == c) && (a != c && a != b))))) {
					System.out.println("等腰三角形");
				} else if (((pow(a, 2) + pow(b, 2)) == pow(c, 2))
						|| (pow(a, 2) + pow(c, 2) == pow(b, 2) || pow(b, 2) + pow(c, 2) == pow(a, 2))) {
					System.out.println("直角三角形");
				} else if ((a + b > c && a > abs(b - c)) || (b + c > a && b > abs(a - c))
						|| (c > a + b && c > abs(a - b))) {
					System.out.println("三角形");
				}
//			else if(str.equals(s1))
////			||str.equals(s2)||str.equals(s3)||str.equals(s4)||str.equals(s5)||str.equals(s6)) 
//				{
//				break;
//			} 突然發現好像只要輸入的不是數字，程式就會自動結束了，要思考一下
				// 9/22 try...catch
				else {
					System.out.println("不是三角形");
				}
//			try {sc1.nextDouble();}catch(InputMismatchException) {}
//			
			}

			
		}
	}
}


