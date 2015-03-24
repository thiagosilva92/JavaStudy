package atividade_4;

public class Atividade_4_12 {
	
	public static void main( String[] args) {
		
		int x = 2;
		int y = 3;
		
		System.out.println(func1(x) - func2(x,y));
	}
	
	public static double func1(int x) {
		
		byte var1 = 0x5;
		short var2 = 0X11;
		return (var2 - var1 + x);
	}
	
	public static double func2(int x, int y) {
		
		double var1 = 20.0;
		byte var2 = 0xF;
		return (var1 + var2 + x + y);
	}
}
