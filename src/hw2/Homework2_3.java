package hw2;

public class Homework2_3 {

	public static void main(String[] args) {
		System.out.println("==========第三題==========");
		System.out.println("設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10)（用while迴圈）");
		int i =1, p=1;
		while (i<=10) {
			p *= i++;
			
		}
		System.out.println(p);
	}

}
