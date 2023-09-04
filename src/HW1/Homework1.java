package HW1;

public class Homework1 {
	public void question1() {
			int num1 = 6, num2 = 12;
			System.out.println("==========第一題==========");
			System.out.println("請設計一支Java程式，計算12，6這兩個數值的和與積");
			System.out.println("12+6=" + (int) (num1 + num2));
			System.out.println("12×6=" + num1 * num2 + "\n");
	}

	public void question2() {
			System.out.println("==========第二題==========");
			System.out.println("請設計一支Java程式，計算200顆蛋共是幾打幾顆？");
			int eggNum = 200, dozen = 12, dozenCount = eggNum / dozen, singleCount = eggNum % dozen;
			System.out.println("200顆蛋共是" + dozenCount + "打又" + singleCount + "顆" + "\n");
	}

	public class question3 {
		public static void main(String[] args) {
			// question 3
			System.out.println("==========第三題==========");
			System.out.println("請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
			int totalTime = 256559, daySec = 60 * 60 * 24, hrSec = 60 * 60, minSec = 60, days = totalTime / daySec,
					hrs = (totalTime % daySec) / hrSec,
//				mins = ((totalTime/60)-(60*(24*days+hrs))), 
					mins = (totalTime % hrSec) / minSec, secs = totalTime % 60;
			System.out.println(totalTime + "秒是" + days + "天" + hrs + "小時" + mins + "分鐘又" + secs + "秒\n");

		}
	}

	public class question4 {
		public static void main(String[] args) {
			System.out.println("==========第四題==========");
			System.out.println("請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長");
			final double pi = 3.1415;
			int r = 5;
			double circleArea = (pi * r * Math.pow(r, 2)), // 圓面積 = πr^2
					c = 2 * pi * r;//圓周長 = 2πr
			System.out.printf("面積為%.2f,周長為%.2f%n\n", circleArea, c);//為求畫面的美觀，還是讓他輸出到小數點後2位
		}
	}
	public class question5{
		public static void main(String[] args) {
			System.out.println("==========第五題==========");
			System.out.println("某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，\n" + "請用程式計算10年後，本金加利息共有多少錢？");
//			int capital = 1500000;
//			double intrestRate = 0.02;
			
			
			
		}	
	}
	public class question6{
	public static void main(String[] args) {

		System.out.println("==========第五題==========");
		System.out.println("請寫一隻程式，利用System.out.println()印出以下三個運算式結果:\n" + "5 + 5\n" + "5 + ‘5’\n" + "5 + “5”\n"
				+ "並請用註解各別說明答案的產生原因");
		}
	}
}


//int r1 = (int)(Math.random()*31);
