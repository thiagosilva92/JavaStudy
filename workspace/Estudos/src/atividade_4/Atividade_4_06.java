package atividade_4;

public class Atividade_4_06 {
	
	public static void main( String[] args ) {
		
		int x = 0xA;
		int y = 0xB;
		
		System.out.println( func1(x,y) + func2(x,y));
	}
	
	public static int func1(int a, int b) {
		return (a + b + 0xE);
	}
	
	public static int func2(int a, int b) {
		return (a + b - 0xA);
	}

}
