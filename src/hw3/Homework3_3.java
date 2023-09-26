package hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
 * 3.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),
 * 畫面會顯示他可以選擇的號碼與總數,如圖:(提示:Scanner)
 * (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
 */

public class Homework3_3 {

	public static void main(String[] args) {
		// 創建一個1-49的陣列物件
		System.out.println("阿文…請輸入你今天不要哪個數字呢？");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int lot[];
		int count=0;
		

		for (int n = 1; n <= 49; n++) {
			if ((n % 10 != num) && (n / 10 != num)) {
				if(n%10 ==0) {
				System.out.println();
				}
					count+=1;
//				int lot[] = new int[n];
				System.out.print(n+"\t");
				
				}
			}
		
		System.out.print("\n"+"能選擇的號碼共："+count+"個");
	}

		
	public static int getRandom(int[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}
}

// 需要創兩個新的array來裝已移除不想要的號碼的陣列
// 一個裝移除完十位數n1-n9的，另一個裝1n,2n,3n,4n的
// ex: num=3 則 需移除 29<num<40 → num*10-1<num<num*10+1 && 10*n+num(n=1,2,3,4)
// num = 9，則需移除 10*n+num
// 9/26更新 想成n%10!=num&&n/10!=num;就解決了
// 還是處理完之後再裝進去陣列？或是乾脆不要用陣列？