package atividade_4;

public class Atividade_4_08 {
	
	public static void main( String[] args) {
		
		int x = 0;
		int y = 0;
		
		System.out.println( func1(x) * func2(y));
	}
	
	public static long func1(int a) {
		
		long var1 = 15L;
		short var2 = 12;
		return (var1 - var2 + a);
	}
	
	public static long func2(int b ) {
		
		long var1 = 10L;
		short var2 = 6;
		return (var1 - var2 + b);
	}
}
