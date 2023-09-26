package homework3;

public class HW3_2 {

	
		public static void main(String[] args) {
			/*
			 * 2.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲, 猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
			 * 
			 * (提示:Scanner,亂數方法,無窮迴圈) (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
			 */

			int i = 0;
			// 創建一個陣列裝0-9的數字
			int guessNumber[] = new int[10];
			for (i = 0; i < 10; i++) {
				guessNumber[i] = (int) (Math.random() * 10) + 1;
				System.out.println(guessNumber[i]);
			}
		}
	}


