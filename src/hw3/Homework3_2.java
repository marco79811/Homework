package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		/*
		 * 2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲, 猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
		 * (提示:Scanner,亂數方法,無窮迴圈) (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		 */

		int i = 0;
		// 創建一個陣列裝0-9的數字
		int guessNumber[] = new int[10];
		for (i = 0; i < 1; i++) {
			guessNumber[i] = (int) (Math.random() * 10);
//				System.out.print(guessNumber[i]);
				//果然放錯地方了，要放迴圈外面
				//下一步，避免有人輸入非數字之字串或是float, double
			while (true) {
				// 剛剛把Array放while迴圈裡的時候，每次執行都會random到一個新的數字
				Scanner sc = new Scanner(System.in);
				//sc的黃色底線表示資料流未關閉
				System.out.println("請輸入一個0-9之間的整數：");
				int num = sc.nextInt();
				if (num == (int) guessNumber[i]) {
					System.out.println("恭喜答對！");
					break;
				} else if (num > (int) guessNumber[i]) {
					System.out.println("太大");
					continue;
				} else {
					System.out.println("太小");
					continue;
				}

			}

		}
	}
}
