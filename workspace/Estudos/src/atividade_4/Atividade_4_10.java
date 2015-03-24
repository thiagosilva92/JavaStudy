package atividade_4;

public class Atividade_4_10 {
	
	public static void main( String[] args) {
		int a = 0x00;
		int b = 0x0A;
		
		System.out.println(func1(b) + func2(a));
	}
	
	public static double func1(int x) {
		
		int var1 = 0xF;
		short var2 = 5;
		return (var2 + var1 + x);
	}
	
	public static double func2(int y) {
		
		double var1 = 10.0;
		short var2 = 0xF;
		return (var1 + var2 + y);
	}
}
