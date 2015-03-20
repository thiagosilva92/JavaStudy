package atividade_4;

public class Atividade_4_05 {
	public static void main( String[] args ) {
		
		int x = 0x10;
		int y = 0x20;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		System.out.println(func1(x,y));
		
	}
	
	public static int func1(int a, int b) {
		
		int var1 = 10;
		int var2 = 0x10;
		
		return (var1 + var2 + a + b);
	}
}
