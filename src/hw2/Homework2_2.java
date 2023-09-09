package hw2;

public class Homework2_2 {
	public static void main(String[] args) {
		System.out.println("==========第二題==========");
		System.out.println("設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10)（用for迴圈）");
		int i = 1, p = 1;
		for (;i<10;i++) {
		p *= (i+1);
		}
		System.out.println(p);
	}

}
