package atividade_4;

public class Atividade_4_07 {
	
	public static void main( String[] args) {
		
		int x = 0x0A;
		
		System.out.println(func1(x) + func2( x) );
	}
	
	public static int func1(int a ) {
		
		int var1 = 0xF;
		short var2 = 12;
		return (var1 + var2 - a);
	}
	
	public static int func2(int b) {
		
		int var1 = 0xA;
		short var2 = 5;
		return (var1 + var2 - b);
	}

}
