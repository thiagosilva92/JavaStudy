package atividade_4;

public class Atividade_4_13 {

	public static void main( String[] args) {
		
		int x = (int)5.9 / (int)3.1;

		int y = (int)4.3 / (int)2.8;
		
		System.out.println(func1(x,y));
	}
	
	public static double func1(int a, int b) {
		
		double var1 = 3.0;
		short var2 = 3;
		return (var2 / var1 + a + b);
	}
}
